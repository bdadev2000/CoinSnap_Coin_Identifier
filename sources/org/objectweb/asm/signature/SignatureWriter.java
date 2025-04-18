package org.objectweb.asm.signature;

/* loaded from: classes2.dex */
public class SignatureWriter extends SignatureVisitor {
    private int argumentStack;
    private boolean hasFormals;
    private boolean hasParameters;
    private final StringBuilder stringBuilder;

    public SignatureWriter() {
        super(589824);
        this.stringBuilder = new StringBuilder();
    }

    private void endArguments() {
        if (this.argumentStack % 2 == 1) {
            this.stringBuilder.append('>');
        }
        this.argumentStack /= 2;
    }

    private void endFormals() {
        if (this.hasFormals) {
            this.hasFormals = false;
            this.stringBuilder.append('>');
        }
    }

    public String toString() {
        return this.stringBuilder.toString();
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitArrayType() {
        this.stringBuilder.append('[');
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitBaseType(char c2) {
        this.stringBuilder.append(c2);
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitClassBound() {
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitClassType(String str) {
        this.stringBuilder.append('L');
        this.stringBuilder.append(str);
        this.argumentStack *= 2;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitEnd() {
        endArguments();
        this.stringBuilder.append(';');
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitExceptionType() {
        this.stringBuilder.append('^');
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitFormalTypeParameter(String str) {
        if (!this.hasFormals) {
            this.hasFormals = true;
            this.stringBuilder.append('<');
        }
        this.stringBuilder.append(str);
        this.stringBuilder.append(':');
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitInnerClassType(String str) {
        endArguments();
        this.stringBuilder.append('.');
        this.stringBuilder.append(str);
        this.argumentStack *= 2;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitInterface() {
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitInterfaceBound() {
        this.stringBuilder.append(':');
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitParameterType() {
        endFormals();
        if (!this.hasParameters) {
            this.hasParameters = true;
            this.stringBuilder.append('(');
        }
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitReturnType() {
        endFormals();
        if (!this.hasParameters) {
            this.stringBuilder.append('(');
        }
        this.stringBuilder.append(')');
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitSuperclass() {
        endFormals();
        return this;
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeArgument() {
        int i2 = this.argumentStack;
        if (i2 % 2 == 0) {
            this.argumentStack = i2 | 1;
            this.stringBuilder.append('<');
        }
        this.stringBuilder.append('*');
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public void visitTypeVariable(String str) {
        this.stringBuilder.append('T');
        this.stringBuilder.append(str);
        this.stringBuilder.append(';');
    }

    @Override // org.objectweb.asm.signature.SignatureVisitor
    public SignatureVisitor visitTypeArgument(char c2) {
        int i2 = this.argumentStack;
        if (i2 % 2 == 0) {
            this.argumentStack = i2 | 1;
            this.stringBuilder.append('<');
        }
        if (c2 != '=') {
            this.stringBuilder.append(c2);
        }
        return this;
    }
}
