CREATE TABLE IF NOT EXISTS `board`
(
    `id`      BIGINT       NOT NULL AUTO_INCREMENT,
    `title`   VARCHAR(255) NOT NULL,
    `content` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`id`)
);
