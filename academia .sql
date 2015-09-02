

CREATE TABLE IF NOT EXISTS `alunos` (
  `user` varchar(100) NOT NULL,
  `pass` varchar(100) NOT NULL,
  `cpf` varchar(60) NOT NULL,
  KEY `psda` (`cpf`)
);

INSERT INTO `alunos` (`user`, `pass`, `cpf`) VALUES
('hoob', '5566', '135.288.386-47'),
('ana', '159', '225.165.165-16');

CREATE TABLE IF NOT EXISTS `cliente` (
  `cpf` varchar(60) NOT NULL,
  `nome` varchar(200) NOT NULL,
  `sobrenome` varchar(200) NOT NULL,
  `idade` int(3) NOT NULL,
  `telefone` varchar(15) NOT NULL,
  `sexo` varchar(100) NOT NULL,
  `endereco` varchar(200) NOT NULL,
  `n` int(5) NOT NULL,
  `complemento` varchar(100) NOT NULL,
  `bairro` varchar(100) NOT NULL,
  `cidade` varchar(100) NOT NULL,
  `uf` varchar(5) NOT NULL,
  `cod_plano` int(11) NOT NULL,
  `cod_horario` int(11) NOT NULL,
  PRIMARY KEY (`cpf`),
  KEY `prf` (`cod_plano`),
  KEY `prf2` (`cod_horario`)
);

INSERT INTO `cliente` (`cpf`, `nome`, `sobrenome`, `idade`, `telefone`, `sexo`, `endereco`, `n`, `complemento`, `bairro`, `cidade`, `uf`, `cod_plano`, `cod_horario`) VALUES
('135.288.386-47', 'Robert', 'Cristian', 18, '(31)9436-0294', 'Masculino', 'Av. Potiguara', 828, '', 'Novo Eldorado', 'Contagem', 'MG', 4, 11),
('225.165.165-16', 'Luiza', 'Monteiro', 22, '(31)1651-5165', 'Feminino', 'rua azalaeia', 22, '', 'novo jardim', 'betim', 'mg', 2, 1);


CREATE TABLE IF NOT EXISTS `exercicios` (
  `cod_ex` int(11) NOT NULL,
  `grupo_ex` int(11) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  KEY `grupo_ex` (`grupo_ex`)
);

INSERT INTO `exercicios` (`cod_ex`, `grupo_ex`, `descricao`) VALUES
(1, 2, 'ABDOMINAL AMPLITUDE MÁXIMA'),
(2, 2, 'ABDOMINAL CANIVETE'),
(3, 2, 'ABDOMINAL INFRA'),
(4, 2, 'ABDOMINAL OBLÍQUO AMPLITUDE MÁXIMA'),
(5, 2, 'ABDOMINAL OBLÍQUO NO APARELHO'),
(6, 2, 'ABDOMINAL OBLÍQUO UNILATERAL'),
(7, 2, 'ABDOMINAL OBLÍQUO'),
(8, 2, 'ABDOMINAL PÉS FIXOS'),
(9, 2, 'ABDOMINAL SUPRA NO APARELHO[1]'),
(10, 2, 'ABDOMINAL SUPRA NO APARELHO[2]'),
(11, 2, 'ABDOMINAL SUPRA'),
(12, 2, 'ABDOMINAL NO APARELHO'),
(13, 6, 'ABDUÇÃO CROSS OVER'),
(14, 6, 'ABDUÇÃO DEITADO COM CANELEIRA'),
(15, 6, 'ABDUÇÃO EM PÉ'),
(16, 6, 'ABDUÇÃO NO APOLETE'),
(17, 6, 'ADUÇÃO CROSS OVER'),
(18, 6, 'ADUÇÃO DEITADO COM CANELEIRA'),
(19, 6, 'ADUÇÃO NO APOLETE'),
(20, 6, 'AFUNDO NA BARRA GUIADA'),
(21, 6, 'AFUNDO'),
(22, 6, 'AGACHAMENTO INCLINADO'),
(23, 6, 'AGACHAMENTO NA BARRA GUIADA'),
(24, 6, 'AGACHAMENTO EM PÉ'),
(25, 6, 'BANCO ABDUTOR'),
(26, 6, 'BANCO ADUTOR'),
(27, 6, 'BANCO EXTENSOR'),
(28, 6, 'BANCO FLEXOR'),
(29, 8, 'PUXADA NA BARRA FIXA'),
(30, 4, 'FLEXÃO DE BRAÇOS NA BARRA PARALELA OLÍMPICA'),
(31, 4, 'FLEXÃO DE BRAÇOS NA BARRA PARALELA'),
(32, 5, 'CRUCIFIXO 30'),
(33, 5, 'CRUCIFIXO 45'),
(34, 5, 'CRUCIFIXO CROSS OVER'),
(35, 5, 'CRUCIFIXO INVERSO NO CROSS OVER'),
(36, 8, 'CRUCIFIXO INVERSO'),
(37, 5, 'CRUCIFIXO NO VOADOR'),
(38, 5, 'CRUCIFIXO'),
(39, 9, 'DESENVOLVIMENTO ALTERNADO'),
(40, 9, 'DESENVOLVIMENTO ARTICULADO'),
(41, 9, 'DESENVOLVIMENTO COM BARRA'),
(42, 9, 'DESENVOLVIMENTO COM HALTERES'),
(43, 9, 'DESENVOLVIMENTO EM PÉ NA BARRA GUIADA'),
(44, 9, 'DESENVOLVIMENTO NO APARELHO'),
(45, 9, 'DESENVOLVIMENTO SENTADO NA BARRA GUIADA'),
(46, 9, 'ELEVAÇÃO FRONTAL ALTERNADA'),
(47, 9, 'ELEVAÇÃO FRONTAL COM HALTERES'),
(48, 9, 'ELEVAÇÃO FRONTAL CROSS OVER'),
(49, 9, 'ELEVAÇÃO FRONTAL COM BARRA'),
(50, 9, 'ELEVAÇÃO LATERAL CROSS OVER'),
(51, 9, 'ELEVAÇÃO LATERAL NO APARELHO'),
(52, 9, 'ELEVAÇÃO LATERAL'),
(53, 6, 'EXTENSÃO DE JOELHOS'),
(54, 1, 'EXTENSÃO DE PUNHO'),
(55, 5, 'FLEXÃO DE BRAÇOS FECHADO'),
(56, 5, 'FLEXÃO DE BRAÇOS'),
(57, 6, 'FLEXÃO DE JOELHOS EM PÉ NO APARELHO'),
(58, 6, 'FLEXÃO DE JOELHOS EM PÉ'),
(59, 6, 'FLEXÃO DE JOELHOS EM 4 APOIOS'),
(60, 6, 'FLEXÃO DE QUADRIL NO APOLETE'),
(61, 6, 'FLEXÃO DE QUADRIL JOELHO ESTENDIDO'),
(62, 6, 'FLEXÃO DE QUADRIL JOELHO FLETIDO'),
(63, 6, 'FLEXÃO PLANTAR UNILATERAL'),
(64, 6, 'FLEXÃO PLANTAR'),
(65, 6, 'FLEXOR SENTADO'),
(66, 6, 'FOOT PRESS'),
(67, 7, 'GLÚTEO 4 APOIOS JOELHO ESTENDIDO'),
(68, 7, 'GLÚTEO 4 APOIOS JOELHO FLETIDO'),
(69, 7, 'GLÚTEO NO APARELHO'),
(70, 7, 'GLÚTEO CROSS OVER'),
(71, 7, 'GLÚTEO COM CANELEIRA'),
(72, 7, 'GLÚTEO NO APOLETE'),
(73, 8, 'GRAVITRON'),
(74, 6, 'HACK'),
(75, 6, 'LEG PRESS INCLINADO'),
(76, 6, 'LEG PRESS DEITADO'),
(77, 6, 'LEG PRESS VERTICAL'),
(78, 6, 'LEG PRESS'),
(79, 8, 'LOMBAR SENTADO'),
(80, 6, 'MESA FLEXORA'),
(81, 6, 'PANTURRILHA SENTADO'),
(82, 6, 'PANTURRILHA VERTICAL'),
(83, 8, 'PULLEY COSTAS'),
(84, 8, 'PULLEY FECHADO'),
(85, 8, 'PULLEY FRENTE'),
(86, 8, 'PULL OVER COM BARRA'),
(87, 8, 'PULL OVER COM HALTERES'),
(88, 9, 'REMADA ALTA COM BARRA'),
(89, 9, 'REMADA ALTA COM HALTERES'),
(90, 9, 'REMADA ALTA CROSS OVER'),
(91, 9, 'REMADA ALTA NA BARRA GUIADA'),
(92, 8, 'REMADA NA POLIA'),
(93, 8, 'REMADA CURVADA COM BARRA'),
(94, 8, 'REMADA CURVADA COM HALTERES'),
(95, 8, 'REMADA NO APARELHO'),
(96, 8, 'REMADA UNILATERAL CROSS OVER'),
(97, 8, 'REMADA UNILATERAL'),
(98, 3, 'ROSCA ALTERNADA'),
(99, 3, 'ROSCA CONCENTRADA'),
(100, 3, 'ROSCA DIRETA COM HALTERES'),
(101, 3, 'ROSCA DIRETA CROSS OVER'),
(102, 3, 'ROSCA DIRETA'),
(103, 6, 'LEVANTAMENTO TERRA (STIFF)'),
(104, 5, 'SUPINO RETO COM HALTERES'),
(105, 5, 'SUPINO INCLINADO COM HALTERES'),
(106, 5, 'SUPINO RETO COM BARRA'),
(107, 5, 'SUPINO INCLINADO COM BARRA'),
(108, 5, 'SUPINO ARTICULADO'),
(109, 5, 'SUPINO RETO NO APARELHO'),
(110, 4, 'TRÍCEPS BANCO'),
(111, 4, 'TRÍCEPS CROSS OVER'),
(112, 4, 'TRÍCEPS CROSS OVER UNILATERAL'),
(113, 4, 'TRÍCEPS FRANCÊS'),
(114, 4, 'TRÍCEPS FRANCÊS CROSS OVER'),
(115, 4, 'TRÍCEPS FRANCÊS UNILATERAL'),
(116, 4, 'TRÍCEPS KICKBACK'),
(117, 4, 'TRÍCEPS PARALELO NO APARELHO'),
(118, 4, 'TRÍCEPS PEITO COM BARRA'),
(119, 4, 'TRÍCEPS PEITO NA BARRA GUIADA'),
(120, 4, 'TRÍCEPS PULLEY'),
(121, 4, 'TRÍCEPS TESTA'),
(122, 4, 'TRÍCEPS TESTA CROSS OVER'),
(123, 8, 'REMADA CURVADA CROSS OVER'),
(124, 8, 'REMADA CURVADA NA BARRA GUIADA'),
(125, 5, 'SUPINO DECLINADO'),
(126, 3, 'ROSCA SCOTCH'),
(127, 3, 'ROSCA UNILATERAL CROSS OVER'),
(128, 3, 'ROSCA MARTELO COM BARRA'),
(129, 3, 'ROSCA MARTELO COM HALTERES');
CREATE TABLE IF NOT EXISTS `grupoexercicios` (
  `grupo_ex` int(11) NOT NULL,
  `descricao` varchar(100) NOT NULL,
  PRIMARY KEY (`grupo_ex`)
);

INSERT INTO `grupoexercicios` (`grupo_ex`, `descricao`) VALUES
(1, 'ANTEBRAÇO'),
(2, 'ABDOME'),
(3, 'BÍCEPS'),
(4, 'TRÍCEPS'),
(5, 'PEITO'),
(6, 'PERNA'),
(7, 'GLÚTEO'),
(8, 'COSTAS'),
(9, 'OMBRO');


CREATE TABLE IF NOT EXISTS `horarios` (
  `cod_horario` int(11) NOT NULL,
  `inicio` time NOT NULL,
  `fim` time NOT NULL,
  PRIMARY KEY (`cod_horario`)
);


INSERT INTO `horarios` (`cod_horario`, `inicio`, `fim`) VALUES
(1, '08:00:00', '09:00:00'),
(2, '09:00:00', '10:00:00'),
(3, '10:00:00', '11:00:00'),
(4, '11:00:00', '12:00:00'),
(5, '13:00:00', '14:00:00'),
(6, '14:00:00', '15:00:00'),
(7, '15:00:00', '16:00:00'),
(8, '16:00:00', '17:00:00'),
(9, '18:00:00', '19:00:00'),
(10, '19:00:00', '20:00:00'),
(11, '20:00:00', '21:00:00'),
(12, '21:00:00', '22:00:00');



CREATE TABLE IF NOT EXISTS `medidas` (
  `cpf` varchar(200) NOT NULL,
  `altura` float NOT NULL,
  `peso` float NOT NULL,
  `busto` float NOT NULL,
  `braco` float NOT NULL,
  `quadril` float NOT NULL,
  `anti_braco` float NOT NULL,
  `coxa` float NOT NULL,
  `panturilha` float NOT NULL,
  `ombro` float NOT NULL,
  KEY `pfcks2` (`cpf`)
) ;

INSERT INTO `medidas` (`cpf`, `altura`, `peso`, `busto`, `braco`, `quadril`, `anti_braco`, `coxa`, `panturilha`, `ombro`) VALUES
('135.288.386-47', 1.75, 66, 12, 0, 0, 0, 0, 0, 0),
('225.165.165-16', 0, 0, 0, 0, 0, 0, 0, 0, 0);



CREATE TABLE IF NOT EXISTS `mensalidades` (
  `cpf` varchar(60) NOT NULL,
  `janeiro` varchar(100) DEFAULT 'Aberto',
  `fevereiro` varchar(100) DEFAULT 'Aberto',
  `marco` varchar(100) DEFAULT 'Aberto',
  `abril` varchar(100) DEFAULT 'Aberto',
  `maio` varchar(100) DEFAULT 'Aberto',
  `junho` varchar(100) DEFAULT 'Aberto',
  `julho` varchar(100) DEFAULT 'Aberto',
  `agosto` varchar(100) DEFAULT 'Aberto',
  `setembro` varchar(100) DEFAULT 'Aberto',
  `outubro` varchar(100) DEFAULT 'Aberto',
  `novembro` varchar(100) DEFAULT 'Aberto',
  `dezembro` varchar(100) DEFAULT 'Aberto',
  PRIMARY KEY (`cpf`),
  KEY `pfk` (`cpf`)
) ;


INSERT INTO `mensalidades` (`cpf`, `janeiro`, `fevereiro`, `marco`, `abril`, `maio`, `junho`, `julho`, `agosto`, `setembro`, `outubro`, `novembro`, `dezembro`) VALUES
('135.288.386-47', 'Pago', 'Pago', 'Pago', 'Aberto', 'Aberto', 'Aberto', 'Aberto', 'Pago', 'Pago', 'Aberto', 'Aberto', 'Aberto'),
('225.165.165-16', 'Aberto', 'Aberto', 'Aberto', 'Aberto', 'Aberto', 'Aberto', 'Aberto', 'Aberto', 'Aberto', 'Aberto', 'Aberto', 'Aberto');


CREATE TABLE IF NOT EXISTS `planos` (
  `cod_plano` int(11) NOT NULL,
  `Descricao` varchar(100) NOT NULL,
  `aulas` int(11) NOT NULL,
  `valor` float NOT NULL,
  PRIMARY KEY (`cod_plano`)
) ;

INSERT INTO `planos` (`cod_plano`, `Descricao`, `aulas`, `valor`) VALUES
(1, 'Simples', 2, 35),
(2, 'Extendido', 3, 45),
(3, 'Premium', 4, 55),
(4, 'Advance', 5, 65);


CREATE TABLE IF NOT EXISTS `treino` (
  `cpf` varchar(200) NOT NULL,
  `cod_ex` int(11) NOT NULL,
  `descricao` varchar(200) NOT NULL,
  `sessao` int(11) NOT NULL,
  `qtd` int(11) NOT NULL,
  KEY `estr` (`cpf`)
);


INSERT INTO `treino` (`cpf`, `cod_ex`, `descricao`, `sessao`, `qtd`) VALUES
('135.288.386-47', 0, '[ABDOMINAL AMPLITUDE MÁXIMA]', 3, 20);


CREATE TABLE IF NOT EXISTS `users` (
  `user` varchar(200) NOT NULL,
  `pass` varchar(6) NOT NULL
) ;



INSERT INTO `users` (`user`, `pass`) VALUES
('admin', '123456'),
('robert', '2946');


ALTER TABLE `alunos`
  ADD CONSTRAINT `alunos_ibfk_1` FOREIGN KEY (`cpf`) REFERENCES `cliente` (`cpf`) ON DELETE CASCADE ON UPDATE CASCADE;


ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`cod_plano`) REFERENCES `planos` (`cod_plano`),
  ADD CONSTRAINT `cliente_ibfk_2` FOREIGN KEY (`cod_horario`) REFERENCES `horarios` (`cod_horario`);


ALTER TABLE `exercicios`
  ADD CONSTRAINT `pf3` FOREIGN KEY (`grupo_ex`) REFERENCES `grupoexercicios` (`grupo_ex`) ON DELETE NO ACTION ON UPDATE CASCADE;


ALTER TABLE `medidas`
  ADD CONSTRAINT `pfcks2` FOREIGN KEY (`cpf`) REFERENCES `cliente` (`cpf`) ON DELETE CASCADE ON UPDATE CASCADE;


ALTER TABLE `mensalidades`
  ADD CONSTRAINT `pfcks` FOREIGN KEY (`cpf`) REFERENCES `cliente` (`cpf`) ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE `treino`
  ADD CONSTRAINT `treino_ibfk_1` FOREIGN KEY (`cpf`) REFERENCES `cliente` (`cpf`) ON DELETE CASCADE ON UPDATE CASCADE;
