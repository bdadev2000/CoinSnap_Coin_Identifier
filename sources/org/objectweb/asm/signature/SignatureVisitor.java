package org.objectweb.asm.signature;

import android.support.v4.media.d;

/* loaded from: classes4.dex */
public abstract class SignatureVisitor {
    public static final char EXTENDS = '+';
    public static final char INSTANCEOF = '=';
    public static final char SUPER = '-';
    protected final int api;

    public SignatureVisitor(int i2) {
        if (i2 != 589824 && i2 != 524288 && i2 != 458752 && i2 != 393216 && i2 != 327680 && i2 != 262144 && i2 != 17432576) {
            throw new IllegalArgumentException(d.i("Unsupported api ", i2));
        }
        this.api = i2;
    }

    public SignatureVisitor visitArrayType() {
        return this;
    }

    public void visitBaseType(char c2) {
    }

    public SignatureVisitor visitClassBound() {
        return this;
    }

    public void visitClassType(String str) {
    }

    public void visitEnd() {
    }

    public SignatureVisitor visitExceptionType() {
        return this;
    }

    public void visitFormalTypeParameter(String str) {
    }

    public void visitInnerClassType(String str) {
    }

    public SignatureVisitor visitInterface() {
        return this;
    }

    public SignatureVisitor visitInterfaceBound() {
        return this;
    }

    public SignatureVisitor visitParameterType() {
        return this;
    }

    public SignatureVisitor visitReturnType() {
        return this;
    }

    public SignatureVisitor visitSuperclass() {
        return this;
    }

    public SignatureVisitor visitTypeArgument(char c2) {
        return this;
    }

    public void visitTypeVariable(String str) {
    }

    public void visitTypeArgument() {
    }
}
