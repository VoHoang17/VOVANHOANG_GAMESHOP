package com.web.demo.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.web.demo.entity.Games;
import com.web.demo.entity.ImageData;
import com.web.demo.entity.Users;

@Repository
public interface GamesRepositoryPD extends JpaRepository<Games, Integer>, PagingAndSortingRepository<Games, Integer> {
	/*
	 * method get games by Filters without Pagination
	 */
	@Query(value = "SELECT * FROM games",
			countQuery = "SELECT count(*) FROM games",
			nativeQuery = true)
	List<Games> findGamesByFilter(Pageable pageable);
	
	/*
	 * method get games by Filters with Pagination
	 */
	@Query(value = "SELECT * FROM games",
			countQuery = "SELECT count(*) FROM games",
			nativeQuery = true)
	Page<Games> findGamesByFilterPaginated(Pageable pageable);
	
	
	/*
	 * method get games by high discount filter with Pagination
	 */
	@Query(value = "SELECT * FROM games INNER JOIN discount "
			+ "ON games.Id_discount = discount.Id_discount "
			+ "ORDER BY discount.Value DESC",
			nativeQuery = true)
	Page<Games> findGamesByDiscountPaginated(Pageable pageable);
	
	/*
	 * method get games by term because user searched with Pagination
	 */
	@Query(value = "SELECT * FROM games WHERE Name_game LIKE %?1%",
			countQuery = "SELECT * FROM games WHERE Name_game LIKE %?1%",
			nativeQuery = true)
	public Page<Games> search(String keyword, Pageable pageable);
	
	
	/*
	 * method count number of games by term because user searched
	 */
	@Query(value = "SELECT Count(*) FROM games WHERE Name_game LIKE %?1%",
			nativeQuery = true)
	public int countSearch(String keyword);
	
	
	/*
	 * method get games by term because user searched with Pagination
	 */
	@Query(value = "SELECT * FROM games WHERE NOT Id_game=?1 ORDER BY Id_game LIMIT 5",
			countQuery = "SELECT count(*) FROM games",
			nativeQuery = true)
	public List<Games> getRecommendGames(int id);
	
	/*
	 * method get games by term because user searched with Pagination
	 */
	@Query(value = "SELECT * FROM games ORDER BY Id_game",
			countQuery = "SELECT count(*) FROM games",
			nativeQuery = true)
	public Page<Games> findAllGameSorted(Pageable pageable);
	
	/*
	 * method get games by Filters with Pagination
	 */
	@Query(value = "SELECT * FROM games WHERE Id_game IN "
			+ "(SELECT Id_game FROM game_category WHERE Id_category = ?1)",
			countQuery = "SELECT count(*) FROM games",
			nativeQuery = true)
	Page<Games> findGamesByCateGoryPaginated(int idCate, Pageable pageable);
	
	/*
	 * method get related games in detail game
	 */
	@Query(value = "SELECT * FROM games WHERE Id_game IN"
			+ " (SELECT Id_game FROM game_category WHERE NOT Id_game = ?1 AND Id_category IN"
			+ " (SELECT Id_category FROM game_category WHERE Id_game = ?2)) LIMIT 5",
			nativeQuery = true)
	List<Games> findRecommendGames(int idGame1, int idGame2);
	
	
	/*
	 * method get related games in detail game
	 */
	@Query(value = "SELECT u.Id_users FROM users u INNER JOIN active_game ag ON "
			+ "u.Id_users = ag.Id_users WHERE ag.Id_game = ?1 AND u.Id_users = ?2",
			nativeQuery = true)
	Integer findActiveGame(int idGame, int idUser);

	
}
