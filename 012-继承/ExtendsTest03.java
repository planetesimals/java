class A
{
}

class B
{
}

class C extends A
{
}

class D extends B
{
}

// 语法错误
// java只允许单继承。不允许多继承。java是简单的。C++支持多重继承。
// C++更接近现实一些。因为在现实世界中儿子同时继承父母两方特征。
/*
class E extends A, B
{
}
*/

class X
{
}

class Y extends X
{
}

class M extends X
{
}

// 其实这也说明了Z是继承X和Y的。
// 这样描述：Z直接继承了Y，Z间接继承了X
class Z extends Y
{
}

/*

	Z继承了Y
	Y继承了X
	X继承了Object

	Z对象具有Object对象的特征（基因）。

	Object是所有类的超类。老祖宗。类体系结构中的根。
	java这么庞大的一个继承结构，最顶点是：Object
*/