package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public abstract class zzhbg {
    public static zzhay zzb(Class cls) {
        String f9;
        ClassLoader classLoader = zzhbg.class.getClassLoader();
        if (cls.equals(zzhay.class)) {
            f9 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else if (cls.getPackage().equals(zzhbg.class.getPackage())) {
            f9 = AbstractC2914a.f(cls.getPackage().getName(), ".BlazeGenerated", cls.getSimpleName(), "Loader");
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return (zzhay) cls.cast(((zzhbg) Class.forName(f9, true, classLoader).getConstructor(null).newInstance(null)).zza());
                    } catch (IllegalAccessException e4) {
                        throw new IllegalStateException(e4);
                    } catch (InstantiationException e9) {
                        throw new IllegalStateException(e9);
                    }
                } catch (NoSuchMethodException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException(e11);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzhbg.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzhay) cls.cast(((zzhbg) it.next()).zza()));
                } catch (ServiceConfigurationError e12) {
                    Logger.getLogger(zzhat.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e12);
                }
            }
            if (arrayList.size() == 1) {
                return (zzhay) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzhay) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e13) {
                throw new IllegalStateException(e13);
            } catch (NoSuchMethodException e14) {
                throw new IllegalStateException(e14);
            } catch (InvocationTargetException e15) {
                throw new IllegalStateException(e15);
            }
        }
    }

    public abstract zzhay zza();
}
