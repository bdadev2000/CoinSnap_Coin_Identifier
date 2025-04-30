package com.apm.insight.b;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static MessageQueue f5740a;
    private static Field b;

    /* renamed from: c, reason: collision with root package name */
    private static Field f5741c;

    public static Message a(Message message) {
        Field field = f5741c;
        if (field != null) {
            try {
                return (Message) field.get(message);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
            f5741c = declaredField;
            declaredField.setAccessible(true);
            return (Message) f5741c.get(message);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static Message a(MessageQueue messageQueue) {
        Field field = b;
        if (field != null) {
            try {
                return (Message) field.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
            b = declaredField;
            declaredField.setAccessible(true);
            return (Message) b.get(messageQueue);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static MessageQueue a() {
        if (f5740a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            f5740a = mainLooper == Looper.myLooper() ? Looper.myQueue() : mainLooper.getQueue();
        }
        return f5740a;
    }

    public static JSONArray a(int i9, long j7) {
        MessageQueue a6 = a();
        JSONArray jSONArray = new JSONArray();
        if (a6 == null) {
            return jSONArray;
        }
        try {
            synchronized (a6) {
                try {
                    Message a9 = a(a6);
                    if (a9 == null) {
                        return jSONArray;
                    }
                    int i10 = 0;
                    int i11 = 0;
                    while (a9 != null && i10 < i9) {
                        i10++;
                        i11++;
                        JSONObject a10 = a(a9, j7);
                        try {
                            a10.put("id", i11);
                        } catch (JSONException unused) {
                        }
                        jSONArray.put(a10);
                        a9 = a(a9);
                    }
                    return jSONArray;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
            return jSONArray;
        }
    }

    private static JSONObject a(Message message, long j7) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j7);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            Object obj = message.obj;
            if (obj != null) {
                jSONObject.put("obj", obj);
            }
        } catch (JSONException e4) {
            e4.printStackTrace();
        }
        return jSONObject;
    }
}
