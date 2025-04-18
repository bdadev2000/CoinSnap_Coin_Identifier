package com.safedk.android.utils;

import android.util.Base64;
import com.safedk.android.analytics.reporters.CrashReporter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f30070a = "SerializingUtils";

    public static String a(Object obj) {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ObjectOutputStream objectOutputStream2;
        String str = null;
        try {
        } catch (Throwable th) {
            Logger.e(f30070a, "failed during serializing object : " + th.getMessage() + " for object : " + obj, th);
            new CrashReporter().caughtException(th);
        }
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                } catch (IOException e) {
                    e = e;
                    objectOutputStream2 = null;
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = null;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e2) {
                            Logger.e(f30070a, "failed during closing serialization streams with object: " + obj, e2);
                            throw th;
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                objectOutputStream2 = null;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                objectOutputStream = null;
                byteArrayOutputStream = null;
            }
            try {
                synchronized (obj) {
                    objectOutputStream2.writeObject(obj);
                }
                objectOutputStream2.flush();
                str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e4) {
                        Logger.e(f30070a, "failed during closing serialization streams with object: " + obj, e4);
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
            } catch (IOException e5) {
                e = e5;
                Logger.e(f30070a, "failed during serialization object: " + obj + " : " + e.getMessage(), e);
                if (objectOutputStream2 != null) {
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e6) {
                        Logger.e(f30070a, "failed during closing serialization streams with object: " + obj, e6);
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                return str;
            }
            return str;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static Object a(String str) throws ClassNotFoundException, IOException {
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 2));
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (Throwable th) {
                th = th;
                objectInputStream = null;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayInputStream = null;
            objectInputStream = null;
        }
        try {
            Object readObject = objectInputStream.readObject();
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    Logger.e(f30070a, "failed while closing serialization stream", e);
                }
            }
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
            return readObject;
        } catch (Throwable th3) {
            th = th3;
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (IOException e2) {
                    Logger.e(f30070a, "failed while closing serialization stream", e2);
                    throw th;
                }
            }
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
            throw th;
        }
    }
}
