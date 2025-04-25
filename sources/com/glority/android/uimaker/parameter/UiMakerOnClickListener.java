package com.glority.android.uimaker.parameter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiMakerOnClickListener.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/glority/android/uimaker/parameter/UiMakerOnClickListener;", "", "onClick", "", "clickEnum", "Lcom/glority/android/uimaker/parameter/ClickEnum;", "onClickByTag", "tag", "", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public interface UiMakerOnClickListener {

    /* compiled from: UiMakerOnClickListener.kt */
    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static void onClickByTag(UiMakerOnClickListener uiMakerOnClickListener, String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
        }
    }

    void onClick(ClickEnum clickEnum);

    void onClickByTag(String tag);
}
