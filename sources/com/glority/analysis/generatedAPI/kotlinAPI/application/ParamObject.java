package com.glority.analysis.generatedAPI.kotlinAPI.application;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ParamObject.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001$B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016H\u0014J\t\u0010\u001a\u001a\u00020\bHÂ\u0003J\u0013\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\u0016\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00160 H\u0016J\u001c\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00160 2\u0006\u0010!\u001a\u00020\u001dJ\b\u0010\"\u001a\u00020\bH\u0016J\t\u0010#\u001a\u00020\u000fHÖ\u0001R&\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\tR&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000f8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/glority/analysis/generatedAPI/kotlinAPI/application/ParamObject;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "intParam", "getIntParam", "()I", "setIntParam", "", "stringParam", "getStringParam", "()Ljava/lang/String;", "setStringParam", "(Ljava/lang/String;)V", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes7.dex */
public final /* data */ class ParamObject extends APIModelBase<ParamObject> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int intParam;
    public String stringParam;
    private int unused;

    public ParamObject() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ ParamObject copy$default(ParamObject paramObject, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = paramObject.unused;
        }
        return paramObject.copy(i);
    }

    public final ParamObject copy(int unused) {
        return new ParamObject(unused);
    }

    public String toString() {
        return "ParamObject(unused=" + this.unused + ")";
    }

    public ParamObject(int i) {
        this.unused = i;
    }

    public /* synthetic */ ParamObject(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getStringParam() {
        String str = this.stringParam;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringParam");
        }
        return str;
    }

    public final void setStringParam(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stringParam = str;
    }

    public final int getIntParam() {
        return this.intParam;
    }

    public final void setIntParam(int i) {
        this.intParam = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ParamObject(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("stringParam") && !obj.isNull("stringParam")) {
            String string = obj.getString("stringParam");
            Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"stringParam\")");
            this.stringParam = string;
            if (obj.has("intParam") && !obj.isNull("intParam")) {
                this.intParam = obj.getInt("intParam");
                return;
            }
            throw new ParameterCheckFailException("intParam is missing in model ParamObject");
        }
        throw new ParameterCheckFailException("stringParam is missing in model ParamObject");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        String str = this.stringParam;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringParam");
        }
        hashMap.put("stringParam", str);
        hashMap.put("intParam", Integer.valueOf(this.intParam));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof ParamObject)) {
            return false;
        }
        String str = this.stringParam;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringParam");
        }
        ParamObject paramObject = (ParamObject) other;
        String str2 = paramObject.stringParam;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringParam");
        }
        return !(Intrinsics.areEqual(str, str2) ^ true) && this.intParam == paramObject.intParam;
    }

    public int hashCode() {
        int hashCode = getClass().hashCode() * 31;
        String str = this.stringParam;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stringParam");
        }
        return ((hashCode + str.hashCode()) * 31) + Integer.valueOf(this.intParam).hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        ParamObject paramObject = new ParamObject(0, 1, null);
        cloneTo(paramObject);
        return paramObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            ParamObject paramObject = (ParamObject) o;
            super.cloneTo(paramObject);
            String str = this.stringParam;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("stringParam");
            }
            String cloneField = cloneField(str);
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.stringParam)");
            paramObject.stringParam = cloneField;
            Integer cloneField2 = cloneField(Integer.valueOf(this.intParam));
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.intParam)");
            paramObject.intParam = cloneField2.intValue();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.analysis.generatedAPI.kotlinAPI.application.ParamObject");
    }

    /* compiled from: ParamObject.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/analysis/generatedAPI/kotlinAPI/application/ParamObject$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getParamObjectJsonArrayMap", "", "array", "Lcom/glority/analysis/generatedAPI/kotlinAPI/application/ParamObject;", "base-analysis_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<Map<String, Object>> getParamObjectJsonArrayMap(List<ParamObject> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ParamObject) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
