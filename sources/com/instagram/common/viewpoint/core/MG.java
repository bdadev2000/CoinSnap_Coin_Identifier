package com.instagram.common.viewpoint.core;

import android.content.DialogInterface;
import android.widget.EditText;
import java.util.concurrent.Executor;

/* loaded from: assets/audience_network.dex */
public class MG implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C0930Vd A01;

    public MG(C0930Vd c0930Vd, EditText editText) {
        this.A01 = c0930Vd;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        Executor executor;
        executor = this.A01.A03;
        executor.execute(new C0931Ve(this, dialogInterface));
    }
}
