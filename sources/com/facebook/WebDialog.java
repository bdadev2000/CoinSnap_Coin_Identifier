package com.facebook;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class WebDialog {

    @NotNull
    public static final WebDialog INSTANCE = new WebDialog();

    private WebDialog() {
    }

    public static final int getWebDialogTheme() {
        return com.facebook.internal.WebDialog.Companion.getWebDialogTheme();
    }

    public static final void setWebDialogTheme(int i2) {
        com.facebook.internal.WebDialog.Companion.setWebDialogTheme(i2);
    }
}
