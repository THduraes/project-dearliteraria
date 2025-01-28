INSERT INTO tb_users (username, password_hash, nickname) VALUES  ('Tamires', 'guizinlindo', 'tatazinha');
INSERT INTO tb_users (username, password_hash, nickname) VALUES  ('Maria Rosa', 'robertolindo', 'MariaRosa');


INSERT INTO tb_book (title, author, genre, img_url, book_year) VALUES ('O Senhor dos Anéis: A Sociedade do Anel', 'J.R.R. Tolkien', 'Fantasia', 'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/book1.png', 1954);
INSERT INTO tb_book (title, author, genre, img_url, book_year) VALUES ('1984', 'George Orwell', 'Distopia', 'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/book2.png', 1949);
INSERT INTO tb_book (title, author, genre, img_url, book_year) VALUES ('Dom Quixote', 'Miguel de Cervantes', 'Clássico', 'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/book3.png', 1605);
INSERT INTO tb_book (title, author, genre, img_url, book_year) VALUES ('Orgulho e Preconceito', 'Jane Austen', 'Romance', 'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/book4.png', 1813);
INSERT INTO tb_book (title, author, genre, img_url, book_year) VALUES ('Moby Dick', 'Herman Melville', 'Aventura', 'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/book5.png', 1851);
INSERT INTO tb_book (title, author, genre, img_url, book_year) VALUES ('Harry Potter e a Pedra Filosofal', 'J.K. Rowling', 'Fantasia', 'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/book6.png', 1997);
INSERT INTO tb_book (title, author, genre, img_url, book_year) VALUES ('O Pequeno Príncipe', 'Antoine de Saint-Exupéry', 'Fábula', 'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/book7.png', 1943);
INSERT INTO tb_book (title, author, genre, img_url, book_year) VALUES ('Crime e Castigo', 'Fiódor Dostoiévski', 'Drama', 'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/book8.png', 1866);
INSERT INTO tb_book (title, author, genre, img_url, book_year) VALUES ('O Hobbit', 'J.R.R. Tolkien', 'Fantasia', 'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/book9.png', 1937);
INSERT INTO tb_book (title, author, genre, img_url, book_year) VALUES ('A Revolução dos Bichos', 'George Orwell', 'Sátira', 'https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/book10.png', 1945);

INSERT INTO tb_posts(short_review, user_id, review, obs) VALUES ('Harry Potter e a Pedra Filosofal, de J.K. Rowling, apresenta o início da jornada do jovem bruxo Harry Potter, que descobre sua verdadeira identidade e enfrenta desafios no mundo mágico de Hogwarts.',0,'Harry Potter e a Pedra Filosofal é o primeiro livro da série escrita por J.K. Rowling, publicado em 1997. A história começa com Harry Potter, um menino órfão que descobre no seu 11º aniversário que é um bruxo e foi aceito na Escola de Magia e Bruxaria de Hogwarts. Lá, ele faz amizades com Hermione Granger e Ron Weasley e descobre mais sobre seu passado e sua ligação com o bruxo das trevas, Lord Voldemort. O enredo mistura aventura, magia e mistério, com temas como amizade, coragem e a luta entre o bem e o mal. A obra é cativante tanto para crianças quanto para adultos, introduzindo um mundo mágico que se tornaria um fenômeno cultural.','Harry Potter e a Pedra Filosofal é ideal para leitores de todas as idades que apreciam histórias de fantasia, magia e aventura, com uma narrativa envolvente e personagens memoráveis.');
INSERT INTO tb_posts(short_review, user_id, review, obs) VALUES ('Orgulho e Preconceito, de Jane Austen, narra a história de Elizabeth Bennet e Mr. Darcy, que superam preconceitos e primeiras impressões para reconhecerem o amor verdadeiro. O romance explora temas como orgulho, julgamentos apressados e as normas sociais da Inglaterra do século XIX.',1,'','');


INSERT INTO tb_belonging (book_id, posts_id, rating) VALUES (6,1,3);
INSERT INTO tb_belonging (book_id, posts_id, rating) VALUES (4,1,5);
INSERT INTO tb_belonging (book_id, posts_id, rating) VALUES (4,2,4);