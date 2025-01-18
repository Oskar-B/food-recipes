CREATE TABLE IF NOT EXISTS Recipe (
    id INTEGER AUTO_INCREMENT,
    title varchar(15000) NOT NULL,
    desc varchar(15000) NOT NULL,
    duration INTEGER,
    date_created TIMESTAMP NOT NULL,
    steps varchar(15000),
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS Nutritions(
    id INTEGER AUTO_INCREMENT,
    calories DOUBLE,
    fat DOUBLE,
    sugar DOUBLE,
    sodium DOUBLE,
    protein DOUBLE,
    PRIMARY KEY (id)
);