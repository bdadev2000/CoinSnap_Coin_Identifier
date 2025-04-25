package com.glority.android.core.definition;

import androidx.databinding.BaseObservable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class APIModelBase<T> extends BaseObservable implements Cloneable, Serializable {
    protected Date _created_at = new Date();
    protected Object tag;

    public abstract Object clone();

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Incorrect return type in method signature: <T:Ljava/lang/Enum<TT;>;>(TT;)TT; */
    public final Enum cloneField(Enum r1) {
        if (r1 == null) {
            return null;
        }
        return r1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cloneTo(Object obj) {
    }

    public Map<String, Object> getJsonMap() {
        return null;
    }

    public Date modelCreatedAt() {
        return this._created_at;
    }

    public Object getTag() {
        return this.tag;
    }

    public void setTag(Object obj) {
        this.tag = obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Boolean parseBoolean(JSONObject jSONObject, String str) throws JSONException {
        try {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        } catch (JSONException unused) {
            return Boolean.valueOf(jSONObject.getInt(str) > 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Map<String, Object> jsonObjectToMap(JSONObject jSONObject) throws JSONException {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.get(next));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Date cloneField(Date date) {
        if (date == null) {
            return null;
        }
        return new Date(date.getTime());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String cloneField(String str) {
        if (str == null) {
            return null;
        }
        return new String(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Integer cloneField(Integer num) {
        if (num == null) {
            return null;
        }
        return new Integer(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Long cloneField(Long l) {
        if (l == null) {
            return null;
        }
        return new Long(l.longValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final BigDecimal cloneField(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        return new BigDecimal(APIModelBase$$ExternalSyntheticBackportWithForwarding0.m(bigDecimal).toPlainString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Double cloneField(Double d) {
        if (d == null) {
            return null;
        }
        return new Double(d.doubleValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Boolean cloneField(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return new Boolean(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map<String, Object> cloneField(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Incorrect return type in method signature: <T:Lcom/glority/android/core/definition/APIModelBase;>(TT;)TT; */
    public final APIModelBase cloneField(APIModelBase aPIModelBase) {
        return (APIModelBase) aPIModelBase.clone();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(this._created_at);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this._created_at = (Date) objectInputStream.readObject();
    }
}
