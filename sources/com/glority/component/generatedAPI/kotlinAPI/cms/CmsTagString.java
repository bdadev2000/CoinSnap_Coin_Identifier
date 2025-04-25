package com.glority.component.generatedAPI.kotlinAPI.cms;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.component.generatedAPI.kotlinAPI.enums.CmsTagValueType;
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

/* compiled from: CmsTagString.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0014J\t\u0010\u001c\u001a\u00020\bHÂ\u0003J\u0013\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\u0016\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00180\"H\u0016J\u001c\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00180\"2\u0006\u0010#\u001a\u00020\u001fJ\b\u0010$\u001a\u00020\bH\u0016J\t\u0010%\u001a\u00020\u0011HÖ\u0001R&\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00118F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006'"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTagString;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsTagValueType;", "type", "getType", "()Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsTagValueType;", "setType", "(Lcom/glority/component/generatedAPI/kotlinAPI/enums/CmsTagValueType;)V", "", "value", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "clone", "", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class CmsTagString extends APIModelBase<CmsTagString> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public CmsTagValueType type;
    private int unused;
    public String value;

    public CmsTagString() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ CmsTagString copy$default(CmsTagString cmsTagString, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cmsTagString.unused;
        }
        return cmsTagString.copy(i);
    }

    public final CmsTagString copy(int unused) {
        return new CmsTagString(unused);
    }

    public String toString() {
        return "CmsTagString(unused=" + this.unused + ')';
    }

    public CmsTagString(int i) {
        this.unused = i;
    }

    public /* synthetic */ CmsTagString(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final CmsTagValueType getType() {
        CmsTagValueType cmsTagValueType = this.type;
        if (cmsTagValueType != null) {
            return cmsTagValueType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("type");
        return null;
    }

    public final void setType(CmsTagValueType cmsTagValueType) {
        Intrinsics.checkNotNullParameter(cmsTagValueType, "<set-?>");
        this.type = cmsTagValueType;
    }

    public final String getValue() {
        String str = this.value;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("value");
        return null;
    }

    public final void setValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.value = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CmsTagString(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has("type") && !obj.isNull("type")) {
            setType(CmsTagValueType.INSTANCE.fromValue(obj.getInt("type")));
            if (obj.has("value") && !obj.isNull("value")) {
                String string = obj.getString("value");
                Intrinsics.checkNotNullExpressionValue(string, "obj.getString(\"value\")");
                setValue(string);
                return;
            }
            throw new ParameterCheckFailException("value is missing in model CmsTagString");
        }
        throw new ParameterCheckFailException("type is missing in model CmsTagString");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(getType().getValue()));
        hashMap.put("value", getValue());
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof CmsTagString)) {
            return false;
        }
        CmsTagString cmsTagString = (CmsTagString) other;
        return getType() == cmsTagString.getType() && Intrinsics.areEqual(getValue(), cmsTagString.getValue());
    }

    public int hashCode() {
        return (((getClass().hashCode() * 31) + getType().hashCode()) * 31) + getValue().hashCode();
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        CmsTagString cmsTagString = new CmsTagString(0, 1, null);
        cloneTo(cmsTagString);
        return cmsTagString;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            CmsTagString cmsTagString = (CmsTagString) o;
            super.cloneTo(cmsTagString);
            Enum cloneField = cloneField(getType());
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.type)");
            cmsTagString.setType((CmsTagValueType) cloneField);
            String cloneField2 = cloneField(getValue());
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.value)");
            cmsTagString.setValue(cloneField2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.cms.CmsTagString");
    }

    /* compiled from: CmsTagString.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTagString$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getCmsTagStringJsonArrayMap", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/cms/CmsTagString;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getCmsTagStringJsonArrayMap(List<CmsTagString> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CmsTagString) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
