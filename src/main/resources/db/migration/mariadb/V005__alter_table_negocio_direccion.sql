ALTER TABLE negocio
ADD COLUMN direccion_calle VARCHAR(255),
ADD COLUMN direccion_numero VARCHAR(255),
ADD COLUMN direccion_colonia VARCHAR(255),
ADD COLUMN direccion_cp VARCHAR(255),
ADD COLUMN direccion_municipio VARCHAR(255),
ADD COLUMN direccion_localidad VARCHAR(255);

UPDATE negocio
SET direccion_calle = JSON_EXTRACT(direccion, '$.calle'),
    direccion_numero = JSON_EXTRACT(direccion, '$.numero'),
    direccion_colonia = JSON_EXTRACT(direccion, '$.colonia'),
    direccion_cp = JSON_EXTRACT(direccion, '$.cp'),
    direccion_municipio = JSON_EXTRACT(direccion, '$.municipio'),
    direccion_localidad = JSON_EXTRACT(direccion, '$.localidad');
