package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.dycreator.binding.response.SplashResData;
import com.mbridge.msdk.dycreator.bus.EventBus;
import com.mbridge.msdk.dycreator.listener.action.EAction;
import com.mbridge.msdk.e.a.a;
import com.mbridge.msdk.e.a.b;

/* loaded from: classes3.dex */
public class MBCountDownView extends MBTextView {

    /* renamed from: a, reason: collision with root package name */
    private b f14984a;
    private MBCountDownView b;

    public MBCountDownView(Context context) {
        super(context);
        this.b = this;
    }

    public void initView(final String str, final String str2, int i9) {
        this.f14984a = new b().b(i9 * 1000).a(1000L).a(new a() { // from class: com.mbridge.msdk.dycreator.baseview.MBCountDownView.1
            @Override // com.mbridge.msdk.e.a.a
            public void onFinish() {
                MBCountDownView.this.f14984a.a();
                SplashResData splashResData = new SplashResData();
                splashResData.seteAction(EAction.CLOSE);
                EventBus.getDefault().post(splashResData);
            }

            @Override // com.mbridge.msdk.e.a.a
            public void onTick(long j7) {
                if (str2.startsWith("zh")) {
                    MBCountDownView.this.b.setText((j7 / 1000) + "s" + str);
                    return;
                }
                MBCountDownView.this.b.setText(MBCountDownView.this.b + " " + (j7 / 1000) + "s");
            }
        });
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f14984a;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.MBTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f14984a;
        if (bVar != null) {
            bVar.a();
        }
    }

    public MBCountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = this;
    }

    public MBCountDownView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.b = this;
    }
}
