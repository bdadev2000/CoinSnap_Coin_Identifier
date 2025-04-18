package org.objectweb.asm;

import com.google.android.gms.common.api.Api;

/* loaded from: classes.dex */
final class Handler {
    final int catchType;
    final String catchTypeDescriptor;
    final Label endPc;
    final Label handlerPc;
    Handler nextHandler;
    final Label startPc;

    public Handler(Label label, Label label2, Label label3, int i2, String str) {
        this.startPc = label;
        this.endPc = label2;
        this.handlerPc = label3;
        this.catchType = i2;
        this.catchTypeDescriptor = str;
    }

    public static int getExceptionTableLength(Handler handler) {
        int i2 = 0;
        while (handler != null) {
            i2++;
            handler = handler.nextHandler;
        }
        return i2;
    }

    public static int getExceptionTableSize(Handler handler) {
        return (getExceptionTableLength(handler) * 8) + 2;
    }

    public static void putExceptionTable(Handler handler, ByteVector byteVector) {
        byteVector.putShort(getExceptionTableLength(handler));
        while (handler != null) {
            byteVector.putShort(handler.startPc.bytecodeOffset).putShort(handler.endPc.bytecodeOffset).putShort(handler.handlerPc.bytecodeOffset).putShort(handler.catchType);
            handler = handler.nextHandler;
        }
    }

    public static Handler removeRange(Handler handler, Label label, Label label2) {
        if (handler == null) {
            return null;
        }
        Handler removeRange = removeRange(handler.nextHandler, label, label2);
        handler.nextHandler = removeRange;
        Label label3 = handler.startPc;
        int i2 = label3.bytecodeOffset;
        Label label4 = handler.endPc;
        int i3 = label4.bytecodeOffset;
        int i4 = label.bytecodeOffset;
        int i5 = label2 == null ? Api.BaseClientBuilder.API_PRIORITY_OTHER : label2.bytecodeOffset;
        if (i4 >= i3 || i5 <= i2) {
            return handler;
        }
        if (i4 <= i2) {
            return i5 >= i3 ? removeRange : new Handler(handler, label2, label4);
        }
        if (i5 >= i3) {
            return new Handler(handler, label3, label);
        }
        handler.nextHandler = new Handler(handler, label2, label4);
        return new Handler(handler, handler.startPc, label);
    }

    public Handler(Handler handler, Label label, Label label2) {
        this(label, label2, handler.handlerPc, handler.catchType, handler.catchTypeDescriptor);
        this.nextHandler = handler.nextHandler;
    }
}
