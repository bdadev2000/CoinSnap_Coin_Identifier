package com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.definition.APIModelBase;
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

/* compiled from: IndexModel.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u00022\u00020\u0003:\u00018B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010+\u001a\u00020\u0013H\u0016J\u0012\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0013H\u0014J\t\u0010/\u001a\u00020\bHÂ\u0003J\u0013\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\u0016\u00104\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0016J\u001c\u00104\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u00105\u001a\u000202J\b\u00106\u001a\u00020\bH\u0016J\t\u00107\u001a\u00020\fHÖ\u0001R2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011RF\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00122\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00128F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\f8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR&\u0010\u001e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\f8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR&\u0010!\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\tR2\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011R&\u0010(\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\f8F@FX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001b\"\u0004\b*\u0010\u001dR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/IndexModel;", "Lcom/glority/android/core/definition/APIModelBase;", "Ljava/io/Serializable;", "", "obj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "unused", "", "(I)V", "<set-?>", "", "", "commonNames", "getCommonNames", "()Ljava/util/List;", "setCommonNames", "(Ljava/util/List;)V", "", "", "fields", "getFields", "()Ljava/util/Map;", "setFields", "(Ljava/util/Map;)V", "latinName", "getLatinName", "()Ljava/lang/String;", "setLatinName", "(Ljava/lang/String;)V", "mainImageUrl", "getMainImageUrl", "setMainImageUrl", "rank", "getRank", "()I", "setRank", "synonyms", "getSynonyms", "setSynonyms", Args.uid, "getUid", "setUid", "clone", "cloneTo", "", "o", "component1", "copy", "equals", "", "other", "getJsonMap", "keepNull", "hashCode", "toString", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes6.dex */
public final /* data */ class IndexModel extends APIModelBase<IndexModel> implements Serializable, Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public List<String> commonNames;
    private Map<String, ? extends Object> fields;
    public String latinName;
    public String mainImageUrl;
    private int rank;
    public List<String> synonyms;
    public String uid;
    private int unused;

    public IndexModel() {
        this(0, 1, null);
    }

    /* renamed from: component1, reason: from getter */
    private final int getUnused() {
        return this.unused;
    }

    public static /* synthetic */ IndexModel copy$default(IndexModel indexModel, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = indexModel.unused;
        }
        return indexModel.copy(i);
    }

    public final IndexModel copy(int unused) {
        return new IndexModel(unused);
    }

    public String toString() {
        return "IndexModel(unused=" + this.unused + ')';
    }

    public IndexModel(int i) {
        this.unused = i;
    }

    public /* synthetic */ IndexModel(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final String getUid() {
        String str = this.uid;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Args.uid);
        return null;
    }

    public final void setUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    public final String getLatinName() {
        String str = this.latinName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("latinName");
        return null;
    }

    public final void setLatinName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.latinName = str;
    }

    public final List<String> getCommonNames() {
        List<String> list = this.commonNames;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("commonNames");
        return null;
    }

    public final void setCommonNames(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.commonNames = list;
    }

    public final List<String> getSynonyms() {
        List<String> list = this.synonyms;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("synonyms");
        return null;
    }

    public final void setSynonyms(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.synonyms = list;
    }

    public final String getMainImageUrl() {
        String str = this.mainImageUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mainImageUrl");
        return null;
    }

    public final void setMainImageUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mainImageUrl = str;
    }

    public final int getRank() {
        return this.rank;
    }

    public final void setRank(int i) {
        this.rank = i;
    }

    public final Map<String, Object> getFields() {
        return this.fields;
    }

    public final void setFields(Map<String, ? extends Object> map) {
        this.fields = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public IndexModel(org.json.JSONObject r10) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch.IndexModel.<init>(org.json.JSONObject):void");
    }

    public final Map<String, Object> getJsonMap(boolean keepNull) {
        HashMap hashMap = new HashMap();
        hashMap.put(Args.uid, getUid());
        hashMap.put("latinName", getLatinName());
        hashMap.put("commonNames", getCommonNames());
        hashMap.put("synonyms", getSynonyms());
        hashMap.put("mainImageUrl", getMainImageUrl());
        hashMap.put("rank", Integer.valueOf(this.rank));
        Map<String, ? extends Object> map = this.fields;
        if (map != null) {
            Intrinsics.checkNotNull(map);
            hashMap.put("fields", map);
        } else if (keepNull) {
            hashMap.put("fields", null);
        }
        return hashMap;
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Map<String, Object> getJsonMap() {
        return getJsonMap(false);
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof IndexModel)) {
            return false;
        }
        IndexModel indexModel = (IndexModel) other;
        return Intrinsics.areEqual(getUid(), indexModel.getUid()) && Intrinsics.areEqual(getLatinName(), indexModel.getLatinName()) && Intrinsics.areEqual(getCommonNames(), indexModel.getCommonNames()) && Intrinsics.areEqual(getSynonyms(), indexModel.getSynonyms()) && Intrinsics.areEqual(getMainImageUrl(), indexModel.getMainImageUrl()) && this.rank == indexModel.rank && Intrinsics.areEqual(this.fields, indexModel.fields);
    }

    public int hashCode() {
        int hashCode = ((((((((((((getClass().hashCode() * 31) + getUid().hashCode()) * 31) + getLatinName().hashCode()) * 31) + getCommonNames().hashCode()) * 31) + getSynonyms().hashCode()) * 31) + getMainImageUrl().hashCode()) * 31) + Integer.hashCode(this.rank)) * 31;
        Map<String, ? extends Object> map = this.fields;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @Override // com.glority.android.core.definition.APIModelBase
    public Object clone() {
        IndexModel indexModel = new IndexModel(0, 1, null);
        cloneTo(indexModel);
        return indexModel;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.core.definition.APIModelBase
    public void cloneTo(Object o) {
        if (o != null) {
            IndexModel indexModel = (IndexModel) o;
            super.cloneTo(indexModel);
            String cloneField = cloneField(getUid());
            Intrinsics.checkNotNullExpressionValue(cloneField, "cloneField(this.uid)");
            indexModel.setUid(cloneField);
            String cloneField2 = cloneField(getLatinName());
            Intrinsics.checkNotNullExpressionValue(cloneField2, "cloneField(this.latinName)");
            indexModel.setLatinName(cloneField2);
            indexModel.setCommonNames(new ArrayList());
            List<String> commonNames = getCommonNames();
            Intrinsics.checkNotNull(commonNames);
            for (String str : commonNames) {
                List<String> commonNames2 = indexModel.getCommonNames();
                Intrinsics.checkNotNull(commonNames2);
                String cloneField3 = cloneField(str);
                Intrinsics.checkNotNullExpressionValue(cloneField3, "cloneField(item)");
                commonNames2.add(cloneField3);
            }
            indexModel.setSynonyms(new ArrayList());
            List<String> synonyms = getSynonyms();
            Intrinsics.checkNotNull(synonyms);
            for (String str2 : synonyms) {
                List<String> synonyms2 = indexModel.getSynonyms();
                Intrinsics.checkNotNull(synonyms2);
                String cloneField4 = cloneField(str2);
                Intrinsics.checkNotNullExpressionValue(cloneField4, "cloneField(item)");
                synonyms2.add(cloneField4);
            }
            String cloneField5 = cloneField(getMainImageUrl());
            Intrinsics.checkNotNullExpressionValue(cloneField5, "cloneField(this.mainImageUrl)");
            indexModel.setMainImageUrl(cloneField5);
            Integer cloneField6 = cloneField(Integer.valueOf(this.rank));
            Intrinsics.checkNotNullExpressionValue(cloneField6, "cloneField(this.rank)");
            indexModel.rank = cloneField6.intValue();
            Map<String, Object> map = this.fields;
            indexModel.fields = map != null ? cloneField(map) : null;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.glority.cmssearch.generatedAPI.kotlinAPI.cmssearch.IndexModel");
    }

    /* compiled from: IndexModel.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\nR!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00048F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/IndexModel$Companion;", "", "()V", "componentTypes", "", "", "Ljava/lang/Class;", "getComponentTypes", "()Ljava/util/Map;", "getIndexModelJsonArrayMap", "", "array", "Lcom/glority/cmssearch/generatedAPI/kotlinAPI/cmssearch/IndexModel;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<Map<String, Object>> getIndexModelJsonArrayMap(List<IndexModel> array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                arrayList = new ArrayList();
                Iterator<T> it = array.iterator();
                while (it.hasNext()) {
                    arrayList.add(((IndexModel) it.next()).getJsonMap());
                }
            }
            return arrayList;
        }

        public final Map<String, Class<?>> getComponentTypes() {
            HashMap hashMap = new HashMap();
            hashMap.put("commonNames", String.class);
            hashMap.put("synonyms", String.class);
            return hashMap;
        }
    }
}
