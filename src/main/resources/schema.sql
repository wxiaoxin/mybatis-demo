DROP TABLE IF EXISTS address;

CREATE TABLE address (
  id          BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  province    VARCHAR(10) COMMENT '省',
  city        VARCHAR(10) COMMENT '市',
  county      VARCHAR(10) COMMENT '区 或 县',
  create_time TIMESTAMP       DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  update_time TIMESTAMP       DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  status      TINYINT         DEFAULT 1 COMMENT '状态'
);


DROP TABLE IF EXISTS user;

CREATE TABLE user (
  id                 BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY COMMENT '主键',
  name               VARCHAR(32) NOT NULL COMMENT '用户名',
  age                TINYINT COMMENT '年龄',
  home_address_id    BIGINT UNSIGNED COMMENT '家庭住址',
  company_address_id BIGINT UNSIGNED COMMENT '公司地址',
  create_time        TIMESTAMP       DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  update_time        TIMESTAMP       DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  status             TINYINT         DEFAULT 1 COMMENT '状态'
)