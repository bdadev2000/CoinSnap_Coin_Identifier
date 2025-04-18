package com.instagram.common.viewpoint.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import org.objectweb.asm.Opcodes;

/* loaded from: assets/audience_network.dex */
public class LR implements InvocationHandler {
    public static byte[] A03;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C7j A01;
    public final /* synthetic */ LinkedBlockingQueue A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{40, 42, 33, 42, 61, 38, 44, 43, 41, 56, 31, 60, 32, 37, 56, 2, 45, 33, 41, 43, 41, 56, 24, 53, 60, 41, 73, 75, 90, 120, 79, 66, 91, 75, 29, 28, 49, 26, 23, 17, 25, 1, 7, 31, 1, 32, 23, 19, 22, 11};
    }

    public LR(int i2, LinkedBlockingQueue linkedBlockingQueue, C7j c7j) {
        this.A00 = i2;
        this.A02 = linkedBlockingQueue;
        this.A01 = c7j;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            if (method.getName().equals(A00(34, 16, 70)) && objArr.length == 1 && (objArr[0] instanceof List)) {
                for (Object c2 : (List) objArr[0]) {
                    String str = (String) c2.getClass().getMethod(A00(7, 12, 120), new Class[0]).invoke(c2, new Object[0]);
                    int intValue = ((Integer) c2.getClass().getMethod(A00(19, 7, 120), new Class[0]).invoke(c2, new Object[0])).intValue();
                    if (str == null && intValue == this.A00) {
                        byte[] value = (byte[]) c2.getClass().getMethod(A00(26, 8, 26), new Class[0]).invoke(c2, new Object[0]);
                        this.A02.put(value);
                        return null;
                    }
                }
                this.A02.put(null);
            }
        } catch (Throwable t2) {
            this.A01.A07().AA0(A00(0, 7, Opcodes.LSHR), C8E.A1G, new C8F(t2));
        }
        return null;
    }
}
