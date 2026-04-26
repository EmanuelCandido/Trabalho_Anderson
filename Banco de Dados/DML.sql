-- Inserindo Professores
INSERT INTO professor (nome, Especialidade) VALUES
('Dr. Carlos Silva', 'Cardiologia'),
('Dra. Ana Paula', 'Neurologia'),
('Dr. Roberto Santos', 'Pediatria');

-- Inserindo Casos Clínicos (dependentes dos IDs dos professores acima)
INSERT INTO caso_clinico (titulo, descricao, id_professor) VALUES
('Paciente com arritmia', 'Paciente masculino, 55 anos, apresenta palpitações, falta de ar e tontura ao realizar esforços mínimos.', 1),
('Cefaleia crônica', 'Paciente feminina, 30 anos, com histórico de enxaqueca severa refratária a tratamentos convencionais.', 2),
('Crise de asma', 'Criança de 7 anos admitida na emergência com chiado no peito e tosse seca contínua.', 3);

-- Inserindo Perguntas (dependentes dos IDs dos casos clínicos acima)
INSERT INTO pergunta (enunciado, id_casoclinico) VALUES
('Qual o exame padrão-ouro para confirmar o tipo de arritmia neste cenário?', 1),
('Quais exames de imagem são indicados para descartar causas secundárias da cefaleia?', 2),
('Qual o diagnóstico diferencial principal para este quadro respiratório agudo?', 3),
('Quais medicamentos compõem o tratamento de resgate inicial?', 3);

-- Atualizando a especialidade de um professor específico
UPDATE professor
SET Especialidade = 'Neurologia Clínica'
WHERE id_professor = 2;

-- Corrigindo ou enriquecendo a descrição de um caso clínico
UPDATE caso_clinico
SET descricao = 'Criança de 7 anos admitida na emergência com chiado no peito, tosse seca contínua e saturação de O2 em 91%.'
WHERE id_casoclinico = 3;

-- Deletando uma pergunta específica (filha de caso_clinico)
DELETE FROM pergunta
WHERE id_pergunta = 4;

-- Deletando todas as perguntas de um caso para, em seguida, deletar o caso em si
DELETE FROM pergunta
WHERE id_casoclinico = 1;

DELETE FROM caso_clinico
WHERE id_casoclinico = 1;