-- Crear tabla direccion
CREATE TABLE direccion (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    calle VARCHAR(255),
    numero VARCHAR(255),
    colonia VARCHAR(255),
    cp VARCHAR(255),
    municipio VARCHAR(255),
    localidad VARCHAR(255)
);

