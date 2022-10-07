������������ ������
�������:
����������� ��������� ������� �� ������.
�� ������ ����� ���������� ����� ����������: ���� ���������� ������ �������� ������� � ���������� ������. ���� � �����, �� �������� ����������, ������� ����� ����������� � ����������� � ������� ������� Tomcat. IDE ������� �������� � ��� ��� ������� ���������� ������, ��� ������ �������� ����������.
� ���� ���������� �� ���������� ������ ����������� spring-webmvc. ��� �� ������, ��� ��� ������ �� ����� ���� ��� ��������, � ������ ������ webmvc-��������� ����� �������� ��������������, ��� ��� ����� ��������� ������� �������� � ���� spring-core.
� ���������� �������� ����� ����� controller, � ������� ���������� ������, �������� ������ ��������� - �����������. ������ ���������� �������� ��� �������� �������� �������� ���������� ���������. ����������� �������� ������, ������� �������� �� ������ url � http-������, ������� ����� ����� �������� � �������� doGet, doPost � �.�.

��� ������� ���������� ��������� � Project Structure �� ������� Modules.
�������� ������ spring_mvc � ������� �+�. ����� ������� ������� ������ Spring � IDEA ���� �������� �����-����������� WebConfig, ���� ��� �� ��������� �������������, �� ��������� ���������� ���� �� ���� ����.
���������� ����� ������� ������ Web, �� � ���� ������ ���� ������ ��������� �� ����� webapp.

������ ��������� � ������ �������, � ���� pom.xml:

��� ���������� ������������� ��������� ������� ��������� ������� ��������� ���������:
1) failOnMissingWebXml �������� ��� ��������� ������ � ������� �������� �������������, ��� ������������� ������������ � web.xml.
2) warSourceDirectory ������ ��������� �� �����, ���������� WEB-INF/
3) � ������������ maven-compiler-plugin ���� ����� ��������� ������ Java.
   ��� ������� ��������� � ������������ �������:

������� edit, ����� ���� � ����� ������� ���� � �������� Tomcat Server -> Local Server.

��������� ������ ���������� �� ��������� ����, �������� ��������� Tomcat, �������� �����, ������� ����� ������ ����� �������, �� /, ��� ��� � ����� ���������� ��� ���� �������� ���� ����������.
����� ������� ��������� ��������. ������� ������ Fix, ����� �+�, �������� �������� � ������ ��������� ��������-war exploded.
����� ����� ����������� ��������� � ���������� ����������.
��� ������� ��������� ������������� � �� ������� �������� �����������.

��������� �������� ����� ������� ����, ��� � ���������� ��� ������ main, ��� ������ ���������� ��-��� Tomcat � ��� ����� ��������� ��������� ����� AppInit, ������� ��������� �� �������� ���������������� ���� � ����������, �� ����� url ����� ���������� ���� ����������.

�������:
1. �������� ��� ���� ����������, ������������ �� /cars.
2. �������� ������ Car � ����� ������������� ������.
3. �������� ������ �� 5 �����.
4. �������� ������ � �������, ������� ����� ���������� ��������� ����� ����� �� ���������� ������.
5. �������� �������� cars.html. ���������� �������� ������� � �������� �� ������� � ������� thymeleaf.
6. ��� ������� /cars �������� ���� ������. ��� ������� /cars?count=2 ������ ������������ ������ �� 2 �����,
   ��� /cars?count=3 - �� 3, � ��. ��� count ? 5 �������� ���� ������ �����.