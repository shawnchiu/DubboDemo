create table card
(
    id          int auto_increment
        primary key,
    balance     decimal                            not null,
    card_number varchar(50)                        not null,
    create_time datetime default CURRENT_TIMESTAMP null,
    version     int      default 0                 not null,
    constraint card_card_number_uindex
        unique (card_number)
);

