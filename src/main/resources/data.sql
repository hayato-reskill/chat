
-- アカウントテーブルにサンプルデータを挿入
INSERT INTO accounts (username, password) VALUES
('user1', 'password_1'),
('user2', 'password_2'),
('user3', 'password_3');

-- メッセージテーブルにサンプルデータを挿入
INSERT INTO messages (sender_id, receiver_id, message_text) VALUES
(1, 2, 'Hello, user2!'),
(2, 1, 'Hi, user1! How are you?'),
(1, 3, 'Hey, user3!'),
(3, 1, 'Hello, user1. Nice to meet you!'),
(2, 3, 'Hi, user3. What are you up to?'),
(3, 2, 'Hey, user2. Just relaxing.');
