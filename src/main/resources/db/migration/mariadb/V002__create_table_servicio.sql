CREATE TABLE servicio (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    negocio_id BIGINT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    foto_servicio_url TEXT,
    descripcion TEXT
);
