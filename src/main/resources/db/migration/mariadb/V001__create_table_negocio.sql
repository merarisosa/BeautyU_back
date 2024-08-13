CREATE TABLE negocio (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(255),
    telefono VARCHAR(20),
    celular VARCHAR(20),
    social_media TEXT,
    photo_header_url TEXT,
    rating DECIMAL(2,1),
    website VARCHAR(100),
    map_location VARCHAR(100)
);
