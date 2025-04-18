package com.bytedance.sdk.component.DSW.tN;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public class qsH {
    private static HashMap<Integer, vc> Sg;
    private static volatile qsH YFl;
    private static HashMap<Integer, YFl> tN;

    private qsH() {
        Sg = new HashMap<>();
        tN = new HashMap<>();
    }

    public static synchronized qsH YFl() {
        qsH qsh;
        synchronized (qsH.class) {
            if (YFl == null) {
                synchronized (qsH.class) {
                    if (YFl == null) {
                        YFl = new qsH();
                    }
                }
            }
            qsh = YFl;
        }
        return qsh;
    }

    public vc YFl(int i10) {
        vc vcVar = Sg.get(Integer.valueOf(i10));
        if (vcVar != null) {
            return vcVar;
        }
        vc vcVar2 = new vc(i10);
        Sg.put(Integer.valueOf(i10), vcVar2);
        return vcVar2;
    }

    public YFl YFl(int i10, Context context) {
        YFl yFl = tN.get(Integer.valueOf(i10));
        if (yFl != null) {
            return yFl;
        }
        YFl yFl2 = new YFl(context, i10);
        tN.put(Integer.valueOf(i10), yFl2);
        return yFl2;
    }
}
