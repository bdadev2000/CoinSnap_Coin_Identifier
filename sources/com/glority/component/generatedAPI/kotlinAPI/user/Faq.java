package com.glority.component.generatedAPI.kotlinAPI.user;

import com.glority.android.core.definition.APIModelBase;
import com.glority.android.core.definition.ParameterCheckFailException;
import com.glority.android.xx.constants.Args;
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

/* compiled from: Faq.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u0001'B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001c\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0019H\u0016J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u0005H\u0016J\b\u0010 \u001a\u00020\u001aH\u0016J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u001aH\u0014J\t\u0010$\u001a\u00020\u0005HÂ\u0003J\u0013\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010&\u001a\u00020\fHÖ\u0001R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0007¨\u0006("}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/Faq;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "unused", "", "<init>", "(I)V", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", Args.title, "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "content", "getContent", "setContent", "faqType", "getFaqType", "()I", "setFaqType", "getJsonMap", "", "", "keepNull", "", "equals", "other", "hashCode", "clone", "cloneTo", "", "o", "component1", "copy", "toString", "Companion", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final /* data */ class Faq extends APIModelBase<Faq> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public String content;
    private int faqType;
    public String title;
    private int unused;

    public Faq() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public final Faq copy(int unused) {
        return new Faq(unused);
    }

    public String toString() {
        return "Faq(unused=" + this.unused + ")";
    }

    public Faq(int i) {
        this.unused = i;
    }

    public /* synthetic */ Faq(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public static /* synthetic */ Faq copy$default(Faq faq, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = faq.unused;
        }
        return faq.copy(i);
    }

    public final String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.title);
        return null;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final String getContent() {
        String str = this.content;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("content");
        return null;
    }

    public final void setContent(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.content = str;
    }

    public final int getFaqType() {
        return this.faqType;
    }

    public final void setFaqType(int i) {
        this.faqType = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Faq(JSONObject obj) throws Exception {
        this(0, 1, null);
        Intrinsics.checkNotNullParameter(obj, "obj");
        if (obj.has(Args.title) && !obj.isNull(Args.title)) {
            setTitle(obj.getString(Args.title));
            if (obj.has("content") && !obj.isNull("content")) {
                setContent(obj.getString("content"));
                if (obj.has("faq_type") && !obj.isNull("faq_type")) {
                    this.faqType = obj.getInt("faq_type");
                    return;
                }
                throw new ParameterCheckFailException("faqType is missing in model Faq");
            }
            throw new ParameterCheckFailException("content is missing in model Faq");
        }
        throw new ParameterCheckFailException("title is missing in model Faq");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(Args.title, getTitle());
        hashMap.put("content", getContent());
        hashMap.put("faq_type", Integer.valueOf(this.faqType));
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof Faq)) {
            return false;
        }
        Faq faq = (Faq) other;
        return Intrinsics.areEqual(getTitle(), faq.getTitle()) && Intrinsics.areEqual(getContent(), faq.getContent()) && this.faqType == faq.faqType;
    }

    public int hashCode() {
        return (((((getClass().hashCode() * 31) + getTitle().hashCode()) * 31) + getContent().hashCode()) * 31) + Integer.hashCode(this.faqType);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        Faq faq = new Faq(0, 1, null);
        cloneTo(faq);
        return faq;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        Intrinsics.checkNotNull(o, "null cannot be cast to non-null type com.glority.component.generatedAPI.kotlinAPI.user.Faq");
        Faq faq = (Faq) o;
        super.cloneTo(faq);
        faq.setTitle(cloneField(getTitle()));
        faq.setContent(cloneField(getContent()));
        faq.faqType = cloneField(Integer.valueOf(this.faqType)).intValue();
    }

    /* compiled from: Faq.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/glority/component/generatedAPI/kotlinAPI/user/Faq$Companion;", "", "<init>", "()V", "getFaqJsonArrayMap", "", "", "", "array", "Lcom/glority/component/generatedAPI/kotlinAPI/user/Faq;", "componentTypes", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "apis_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getFaqJsonArrayMap(List<Faq> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Faq) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            return new HashMap();
        }
    }
}
