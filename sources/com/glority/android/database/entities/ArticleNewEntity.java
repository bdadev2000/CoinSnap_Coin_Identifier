package com.glority.android.database.entities;

import com.glority.android.xx.constants.Args;
import com.picturecoin.generatedAPI.kotlinAPI.model.CoinTag;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ArticleNewEntity.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0003X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u0005R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0011\u001a\u00020\u0003X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0005R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/glority/android/database/entities/ArticleNewEntity;", "", Args.uid, "", "<init>", "(Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", Args.title, "getTitle", "setTitle", "mainImageUrl", "getMainImageUrl", "setMainImageUrl", "url", "getUrl", "setUrl", "darkUrl", "getDarkUrl", "setDarkUrl", "tags", "", "Lcom/picturecoin/generatedAPI/kotlinAPI/model/CoinTag;", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "database_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes7.dex */
public final class ArticleNewEntity {
    public String darkUrl;
    public String mainImageUrl;
    private List<CoinTag> tags;
    public String title;
    private final String uid;
    public String url;

    public ArticleNewEntity(String uid) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        this.uid = uid;
    }

    public final String getUid() {
        return this.uid;
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

    public final String getUrl() {
        String str = this.url;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("url");
        return null;
    }

    public final void setUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final String getDarkUrl() {
        String str = this.darkUrl;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("darkUrl");
        return null;
    }

    public final void setDarkUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.darkUrl = str;
    }

    public final List<CoinTag> getTags() {
        return this.tags;
    }

    public final void setTags(List<CoinTag> list) {
        this.tags = list;
    }
}
