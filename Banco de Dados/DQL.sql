-- Listar todos os professores ordenados por nome em ordem alfabética
SELECT * FROM professor
ORDER BY nome ASC;

-- Buscar casos clínicos filtrando por uma palavra-chave no título (Case-insensitive no PostgreSQL)
SELECT titulo, descricao 
FROM caso_clinico
WHERE titulo ILIKE '%asma%';

-- Listar Casos Clínicos juntamente com o nome e especialidade do Professor responsável
SELECT 
    cc.id_casoclinico,
    cc.titulo, 
    p.nome AS professor_responsavel, 
    p.Especialidade
FROM caso_clinico cc
JOIN professor p ON cc.id_professor = p.id_professor;

-- Listar todas as Perguntas de um Caso Clínico específico
SELECT 
    cc.titulo AS caso,
    perg.enunciado AS pergunta
FROM pergunta perg
JOIN caso_clinico cc ON perg.id_casoclinico = cc.id_casoclinico
WHERE cc.id_casoclinico = 3;

-- Relatório completo: Mostra o Professor, o Caso Clínico e as Perguntas atreladas a ele
SELECT 
    prof.nome AS professor, 
    cc.titulo AS caso_clinico, 
    perg.enunciado AS pergunta
FROM professor prof
JOIN caso_clinico cc ON prof.id_professor = cc.id_professor
JOIN pergunta perg ON cc.id_casoclinico = perg.id_casoclinico
ORDER BY prof.nome, cc.titulo;

-- Contar quantas perguntas cada caso clínico possui (Agregação com GROUP BY)
SELECT 
    cc.titulo, 
    COUNT(perg.id_pergunta) AS quantidade_perguntas
FROM caso_clinico cc
LEFT JOIN pergunta perg ON cc.id_casoclinico = perg.id_casoclinico
GROUP BY cc.id_casoclinico, cc.titulo
ORDER BY quantidade_perguntas DESC;