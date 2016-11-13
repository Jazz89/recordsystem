--insert into account (username,password,enabled,creditionalsexpired,expired,locked) values ('user','$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.',true,false,false,false);
--insert into account (username,password,enabled,creditionalsexpired,expired,locked) values ('user','$$2a$10$p3cVZj.W0BcvJ/t6fVZfS.zwGAih.qsh5.PYnhqXBpGvDjMo95jna',true,false,false,false);
--insert into account (username,password,enabled,creditionalsexpired,expired,locked) values ('user','password',true,false,false,false);
--insert into account (username,password,enabled,creditionalsexpired,expired,locked) values ('operations','$2a$10$p3cVZj.W0BcvJ/t6fVZfS.zwGAih.qsh5.PYnhqXBpGvDjMo95jna',true,false,false,false);

-- password is 'password'
INSERT INTO Account (referenceId, username, password, enabled, credentialsexpired, expired, locked, version, createdBy, createdAt, updatedBy, updatedAt) VALUES ('a07bd221-3ecd-4893-a0f0-78d7c0fbf94e', 'user', '$2a$10$9/44Rne7kQqPXa0cY6NfG.3XzScMrCxFYjapoLq/wFmHz7EC9praK', true, false, false, false, 0, 'user', NOW(), NULL, NULL);
-- password is 'operations'
INSERT INTO Account (referenceId, username, password, enabled, credentialsexpired, expired, locked, version, createdBy, createdAt, updatedBy, updatedAt) VALUES ('7bd137c8-ab64-4a45-bf2d-d9bae3574622', 'operations', '$2a$10$CoMVfutnv1qZ.fNlHY1Na.rteiJhsDF0jB1o.76qXcfdWN6As27Zm', true, false, false, false, 0, 'user', NOW(), NULL, NULL);


INSERT INTO Role (id, code, label, ordinal, effectiveAt, expiresAt, createdAt) VALUES (1, 'ROLE_USER', 'User', 0, '2015-01-01 00:00:00', NULL, NOW());
INSERT INTO Role (id, code, label, ordinal, effectiveAt, expiresAt, createdAt) VALUES (2, 'ROLE_ADMIN', 'Admin', 1, '2015-01-01 00:00:00', NULL, NOW());
INSERT INTO Role (id, code, label, ordinal, effectiveAt, expiresAt, createdAt) VALUES (3, 'ROLE_SYSADMIN', 'System Admin', 2, '2015-01-01 00:00:00', NULL, NOW());

INSERT INTO Account_Role (account_id, role_id) SELECT a.id, r.id FROM Account a, Role r WHERE a.username = 'user' and r.id = 1;
INSERT INTO Account_Role (account_id, role_id) SELECT a.id, r.id FROM Account a, Role r WHERE a.username = 'operations' and r.id = 3;
