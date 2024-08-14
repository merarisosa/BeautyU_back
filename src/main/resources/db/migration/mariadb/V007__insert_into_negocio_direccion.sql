UPDATE negocio
SET direccion_id = CASE nombre
    WHEN 'The Mane Attraction' THEN 1
    WHEN 'Nailed It! Studio' THEN 2
    WHEN 'Browtiful' THEN 3
    WHEN 'Lash & Dash' THEN 4
    WHEN 'Glow & Flow Salon' THEN 5
END
WHERE nombre IN ('The Mane Attraction', 'Nailed It! Studio', 'Browtiful', 'Lash & Dash', 'Glow & Flow Salon');
