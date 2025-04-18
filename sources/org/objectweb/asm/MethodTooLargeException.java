package org.objectweb.asm;

/* loaded from: classes4.dex */
public final class MethodTooLargeException extends IndexOutOfBoundsException {
    private static final long serialVersionUID = 6807380416709738314L;
    private final String className;
    private final int codeSize;
    private final String descriptor;
    private final String methodName;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MethodTooLargeException(java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r3 = this;
            java.lang.String r0 = "Method too large: "
            java.lang.String r1 = "."
            java.lang.String r2 = " "
            java.lang.StringBuilder r0 = androidx.compose.foundation.text.input.a.t(r0, r4, r1, r5, r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            r3.className = r4
            r3.methodName = r5
            r3.descriptor = r6
            r3.codeSize = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.MethodTooLargeException.<init>(java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public String getClassName() {
        return this.className;
    }

    public int getCodeSize() {
        return this.codeSize;
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public String getMethodName() {
        return this.methodName;
    }
}
