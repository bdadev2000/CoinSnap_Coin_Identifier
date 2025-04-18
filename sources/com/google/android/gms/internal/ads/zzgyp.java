package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzgyp {
    public static zzgyh zzb(Class cls) {
        String format;
        ClassLoader classLoader = zzgyp.class.getClassLoader();
        if (cls.equals(zzgyh.class)) {
            format = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else if (cls.getPackage().equals(zzgyp.class.getPackage())) {
            format = String.format("%s.BlazeGenerated%sLoader", cls.getPackage().getName(), cls.getSimpleName());
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            try {
                try {
                    try {
                        return (zzgyh) cls.cast(((zzgyp) Class.forName(format, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
                    } catch (InstantiationException e2) {
                        throw new IllegalStateException(e2);
                    } catch (NoSuchMethodException e10) {
                        throw new IllegalStateException(e10);
                    }
                } catch (InvocationTargetException e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (IllegalAccessException e12) {
                throw new IllegalStateException(e12);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(zzgyp.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzgyh) cls.cast(((zzgyp) it.next()).zza()));
                } catch (ServiceConfigurationError e13) {
                    Logger.getLogger(zzgyc.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e13);
                }
            }
            if (arrayList.size() == 1) {
                return (zzgyh) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzgyh) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e14) {
                throw new IllegalStateException(e14);
            } catch (NoSuchMethodException e15) {
                throw new IllegalStateException(e15);
            } catch (InvocationTargetException e16) {
                throw new IllegalStateException(e16);
            }
        }
    }

    public abstract zzgyh zza();
}
