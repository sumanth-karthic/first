SELECT
    e.city,
    COUNT(DISTINCT r.user_id) AS total_users
FROM Events e
JOIN Registrations r
    ON e.event_id = r.event_id
GROUP BY e.city
ORDER BY total_users DESC
LIMIT 5;