CREATE TABLE presentations (
    id          SERIAL PRIMARY KEY,
    euid        VARCHAR(255) NOT NULL,
    title       VARCHAR(255) NOT NULL,
    description TEXT         NOT NULL,
    created_at  TIMESTAMP    NOT NULL DEFAULT NOW(),
    updated_at  TIMESTAMP    NOT NULL DEFAULT NOW()
)