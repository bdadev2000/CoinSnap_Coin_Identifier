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
    private static MessageQueue a;

    /* renamed from: b, reason: collision with root package name */
    private static Field f3062b;

    /* renamed from: c, reason: collision with root package name */
    private static Field f3063c;

    public static Message a(Message message) {
        Field field = f3063c;
        if (field != null) {
            try {
                return (Message) field.get(message);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
            f3063c = declaredField;
            declaredField.setAccessible(true);
            return (Message) f3063c.get(message);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static Message a(MessageQueue messageQueue) {
        Field field = f3062b;
        if (field != null) {
            try {
                return (Message) field.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
            f3062b = declaredField;
            declaredField.setAccessible(true);
            return (Message) f3062b.get(messageQueue);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static MessageQueue a() {
        if (a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            a = mainLooper == Looper.myLooper() ? Looper.myQueue() : mainLooper.getQueue();
        }
        return a;
    }

    public static JSONArray a(int i10, long j3) {
        MessageQueue a10 = a();
        JSONArray jSONArray = new JSONArray();
        if (a10 == null) {
            return jSONArray;
        }
        try {
            synchronized (a10) {
                Message a11 = a(a10);
                if (a11 == null) {
                    return jSONArray;
                }
                int i11 = 0;
                int i12 = 0;
                while (a11 != null && i11 < i10) {
                    i11++;
                    i12++;
                    JSONObject a12 = a(a11, j3);
                    try {
                        a12.put("id", i12);
                    } catch (JSONException unused) {
                    }
                    jSONArray.put(a12);
                    a11 = a(a11);
                }
                return jSONArray;
            }
        } catch (Throwable th2) {
            com.apm.insight.c.a().a("NPTH_CATCH", th2);
            return jSONArray;
        }
    }

    private static JSONObject a(Message message, long j3) {
        JSONObject jSONObject = new JSONObject();
        if (message == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("when", message.getWhen() - j3);
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
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }
}
