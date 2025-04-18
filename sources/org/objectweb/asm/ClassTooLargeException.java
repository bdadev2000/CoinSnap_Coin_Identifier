package org.objectweb.asm;

import androidx.compose.ui.platform.j;

/* loaded from: classes3.dex */
public final class ClassTooLargeException extends IndexOutOfBoundsException {
    private static final long serialVersionUID = 160715609518896765L;
    private final String className;
    private final int constantPoolCount;

    public ClassTooLargeException(String str, int i2) {
        super(j.b("Class too large: ", str));
        this.className = str;
        this.constantPoolCount = i2;
    }

    public String getClassName() {
        return this.className;
    }

    public int getConstantPoolCount() {
        return this.constantPoolCount;
    }
}
