package com.glority.android.namecard.base.entity;

import com.glority.android.xx.constants.Args;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SimpleCmsObject.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/glority/android/namecard/base/entity/SimpleCmsObject;", "", Args.uid, "", "name", "Lcom/glority/android/namecard/base/entity/SimpleTaxonomyName;", "(Ljava/lang/String;Lcom/glority/android/namecard/base/entity/SimpleTaxonomyName;)V", "getName", "()Lcom/glority/android/namecard/base/entity/SimpleTaxonomyName;", "popularCultivarNames", "", "Lcom/glority/android/namecard/base/entity/PopularCultivarName;", "getPopularCultivarNames", "()Ljava/util/List;", "setPopularCultivarNames", "(Ljava/util/List;)V", "taxonomies", "getTaxonomies", "setTaxonomies", "taxonomyFamilyParent", "getTaxonomyFamilyParent", "setTaxonomyFamilyParent", "(Lcom/glority/android/namecard/base/entity/SimpleTaxonomyName;)V", "taxonomyParent", "getTaxonomyParent", "setTaxonomyParent", "getUid", "()Ljava/lang/String;", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class SimpleCmsObject {
    private final SimpleTaxonomyName name;
    private List<PopularCultivarName> popularCultivarNames;
    private List<SimpleTaxonomyName> taxonomies;
    private SimpleTaxonomyName taxonomyFamilyParent;
    private SimpleTaxonomyName taxonomyParent;
    private final String uid;

    public SimpleCmsObject(String uid, SimpleTaxonomyName name) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(name, "name");
        this.uid = uid;
        this.name = name;
        this.taxonomies = new ArrayList();
        this.popularCultivarNames = new ArrayList();
    }

    public final SimpleTaxonomyName getName() {
        return this.name;
    }

    public final String getUid() {
        return this.uid;
    }

    public final SimpleTaxonomyName getTaxonomyParent() {
        return this.taxonomyParent;
    }

    public final void setTaxonomyParent(SimpleTaxonomyName simpleTaxonomyName) {
        this.taxonomyParent = simpleTaxonomyName;
    }

    public final SimpleTaxonomyName getTaxonomyFamilyParent() {
        return this.taxonomyFamilyParent;
    }

    public final void setTaxonomyFamilyParent(SimpleTaxonomyName simpleTaxonomyName) {
        this.taxonomyFamilyParent = simpleTaxonomyName;
    }

    public final List<SimpleTaxonomyName> getTaxonomies() {
        return this.taxonomies;
    }

    public final void setTaxonomies(List<SimpleTaxonomyName> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.taxonomies = list;
    }

    public final List<PopularCultivarName> getPopularCultivarNames() {
        return this.popularCultivarNames;
    }

    public final void setPopularCultivarNames(List<PopularCultivarName> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.popularCultivarNames = list;
    }
}
