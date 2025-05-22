(
    SELECT name AS results
    FROM (
        SELECT u.name, COUNT(*) AS rating_count
        FROM MovieRating mr
        JOIN Users u ON mr.user_id = u.user_id
        GROUP BY u.user_id, u.name
    ) AS user_ratings
    ORDER BY rating_count DESC, name ASC
    LIMIT 1
)
UNION ALL
(
    SELECT title AS results
    FROM (
        SELECT m.title, AVG(mr.rating) AS avg_rating
        FROM MovieRating mr
        JOIN Movies m ON mr.movie_id = m.movie_id
        WHERE mr.created_at BETWEEN '2020-02-01' AND '2020-02-29'
        GROUP BY m.movie_id, m.title
    ) AS movie_avg
    ORDER BY avg_rating DESC, title ASC
    LIMIT 1
);
