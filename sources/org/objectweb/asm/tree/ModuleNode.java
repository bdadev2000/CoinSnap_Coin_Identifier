package org.objectweb.asm.tree;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ModuleVisitor;

/* loaded from: classes3.dex */
public class ModuleNode extends ModuleVisitor {
    public int access;
    public List<ModuleExportNode> exports;
    public String mainClass;
    public String name;
    public List<ModuleOpenNode> opens;
    public List<String> packages;
    public List<ModuleProvideNode> provides;
    public List<ModuleRequireNode> requires;
    public List<String> uses;
    public String version;

    public ModuleNode(String str, int i2, String str2) {
        super(589824);
        if (getClass() != ModuleNode.class) {
            throw new IllegalStateException();
        }
        this.name = str;
        this.access = i2;
        this.version = str2;
    }

    public void accept(ClassVisitor classVisitor) {
        ModuleVisitor visitModule = classVisitor.visitModule(this.name, this.access, this.version);
        if (visitModule == null) {
            return;
        }
        String str = this.mainClass;
        if (str != null) {
            visitModule.visitMainClass(str);
        }
        List<String> list = this.packages;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                visitModule.visitPackage(this.packages.get(i2));
            }
        }
        List<ModuleRequireNode> list2 = this.requires;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.requires.get(i3).accept(visitModule);
            }
        }
        List<ModuleExportNode> list3 = this.exports;
        if (list3 != null) {
            int size3 = list3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                this.exports.get(i4).accept(visitModule);
            }
        }
        List<ModuleOpenNode> list4 = this.opens;
        if (list4 != null) {
            int size4 = list4.size();
            for (int i5 = 0; i5 < size4; i5++) {
                this.opens.get(i5).accept(visitModule);
            }
        }
        List<String> list5 = this.uses;
        if (list5 != null) {
            int size5 = list5.size();
            for (int i6 = 0; i6 < size5; i6++) {
                visitModule.visitUse(this.uses.get(i6));
            }
        }
        List<ModuleProvideNode> list6 = this.provides;
        if (list6 != null) {
            int size6 = list6.size();
            for (int i7 = 0; i7 < size6; i7++) {
                this.provides.get(i7).accept(visitModule);
            }
        }
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitEnd() {
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitExport(String str, int i2, String... strArr) {
        if (this.exports == null) {
            this.exports = new ArrayList(5);
        }
        this.exports.add(new ModuleExportNode(str, i2, Util.asArrayList(strArr)));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitMainClass(String str) {
        this.mainClass = str;
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitOpen(String str, int i2, String... strArr) {
        if (this.opens == null) {
            this.opens = new ArrayList(5);
        }
        this.opens.add(new ModuleOpenNode(str, i2, Util.asArrayList(strArr)));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitPackage(String str) {
        if (this.packages == null) {
            this.packages = new ArrayList(5);
        }
        this.packages.add(str);
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitProvide(String str, String... strArr) {
        if (this.provides == null) {
            this.provides = new ArrayList(5);
        }
        this.provides.add(new ModuleProvideNode(str, Util.asArrayList(strArr)));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitRequire(String str, int i2, String str2) {
        if (this.requires == null) {
            this.requires = new ArrayList(5);
        }
        this.requires.add(new ModuleRequireNode(str, i2, str2));
    }

    @Override // org.objectweb.asm.ModuleVisitor
    public void visitUse(String str) {
        if (this.uses == null) {
            this.uses = new ArrayList(5);
        }
        this.uses.add(str);
    }

    public ModuleNode(int i2, String str, int i3, String str2, List<ModuleRequireNode> list, List<ModuleExportNode> list2, List<ModuleOpenNode> list3, List<String> list4, List<ModuleProvideNode> list5) {
        super(i2);
        this.name = str;
        this.access = i3;
        this.version = str2;
        this.requires = list;
        this.exports = list2;
        this.opens = list3;
        this.uses = list4;
        this.provides = list5;
    }
}
