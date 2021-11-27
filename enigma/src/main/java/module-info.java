module Enigma.enigma.main {
    exports cuchaz.enigma;
    exports cuchaz.enigma.api;
    uses cuchaz.enigma.api.EnigmaPlugin;
    requires org.objectweb.asm;
    requires org.objectweb.asm.tree;
    requires org.objectweb.asm.tree.analysis;
    requires java.xml;
    requires jsr305;
    requires java.desktop;
    requires com.google.gson;
    requires java.compiler;
}