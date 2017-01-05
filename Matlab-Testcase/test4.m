% Simple programming

% Giai phuong trinh bac nhat
a = input('nhap a = ');
b = input('nhap b = ');
if (a ~= 0)
	x = -b/a;
	disp(['nghiem so x = ', num2str(x)]);
else
	if (b ~= 0)
		disp('ptvn')
	else
		disp('ptvsn')
	end
end

disp('tinh tong');
n = input('nhap so hang can tinh tong n = ');
s = 0; % gia tri ban dau cua tong s
for i = 1:n
	s = s+i;
end
disp(['tong so s = ', num2str(s)]);

disp('tinh giai thua');
n = input('nhap so hang can tinh giai thua n = ');
GT = 1;
i = 1;
while (i <= n)
	GT = GT*i;
	i = i+1;
end
disp(GT);