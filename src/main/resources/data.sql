insert into issues (summary, description) values ('バグA', 'バグがあります');
insert into issues (summary, description) values ('機能要望B', 'Bに追加機能がほしいです');
insert into issues (summary, description) values ('画面Cが遅い', '早くしてほしいです');

--5ca39a7327f4278d99649038f4d59bed28e07cb02aed2aa8a7e7aa7ee61a07cb34d4eb721f9fc77b
--insert into users (username, password, authority) values ('tom', '11547c8c12d37de9a60f743f64a46a8edab998614e0a86549c04aa6aa601ca48bed44b3d12879223', 'ADMIN');
--insert into users (username, password, authority) values ('koki', '085a0f7db7f0babc238af3fe59c0ca7d26221917d7f0175d51db7442306a10fe34f94290b4674b62', 'USER');
--insert into users (username, password, authority) values ('a', 'aabf4cae17218549791092c4a8fde0923ee04b13d4d21c83161b8769ba779b4ed0dea04ca1edccdb', 'ADMIN');


insert into users (userid, username, password) values (1, 'tom', '5ca39a7327f4278d99649038f4d59bed28e07cb02aed2aa8a7e7aa7ee61a07cb34d4eb721f9fc77b');
insert into users (userid, username, password) values (2, 'koki', '5ca39a7327f4278d99649038f4d59bed28e07cb02aed2aa8a7e7aa7ee61a07cb34d4eb721f9fc77b');
insert into users (userid, username, password) values (3, 'a', '5ca39a7327f4278d99649038f4d59bed28e07cb02aed2aa8a7e7aa7ee61a07cb34d4eb721f9fc77b');


insert into rolls (rollid, authority) values(1, 'ADMIN');
insert into rolls (rollid, authority) values(2, 'USER');

insert into usersrolls (userid, rollid) values(1, 1);
insert into usersrolls (userid, rollid) values(1, 2);
insert into usersrolls (userid, rollid) values(2, 2);
insert into usersrolls (userid, rollid) values(3, 2);


