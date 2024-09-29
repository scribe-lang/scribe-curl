let builder = @import("std/builder");

let setup in builder.Builder = fn(): i1 {
	self.installHeaders("headers");
	// self.addExe("test1", "tests/1.sc");
	return true;
};
