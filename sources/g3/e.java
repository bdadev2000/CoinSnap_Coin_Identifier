package g3;

import a4.q;
import a4.r;
import a4.t;
import a4.u;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.plantcare.ai.identifier.plantid.R;
import com.plantcare.ai.identifier.plantid.ui.component.iap.IapActivity;
import java.util.ArrayList;
import v9.g;

/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: s, reason: collision with root package name */
    public final u f18025s;

    /* renamed from: t, reason: collision with root package name */
    public final int f18026t;
    public TextView u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f18027v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f18028w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f18029x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f18030y;

    /* renamed from: z, reason: collision with root package name */
    public final k3.a f18031z;

    public e(u uVar, IapActivity iapActivity, k3.a aVar) {
        super(iapActivity, 0);
        i();
        this.f18025s = uVar;
        this.f18026t = 1;
        this.f18031z = aVar;
    }

    @Override // v9.g, h.i0, androidx.activity.o, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.view_billing_test);
        this.u = (TextView) findViewById(R.id.txtTitle);
        this.f18027v = (TextView) findViewById(R.id.txtDescription);
        this.f18028w = (TextView) findViewById(R.id.txtId);
        this.f18029x = (TextView) findViewById(R.id.txtPrice);
        this.f18030y = (TextView) findViewById(R.id.txtContinuePurchase);
        final int i10 = 1;
        final int i11 = 0;
        u uVar = this.f18025s;
        if (uVar == null) {
            if (l3.a.a.booleanValue()) {
                this.f18030y.setOnClickListener(new View.OnClickListener(this) { // from class: g3.d

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ e f18024c;

                    {
                        this.f18024c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i12 = i11;
                        e eVar = this.f18024c;
                        switch (i12) {
                            case 0:
                                eVar.getClass();
                                c.a().f18018m = true;
                                k3.a aVar = eVar.f18031z;
                                if (aVar != null) {
                                    ((ag.b) aVar).e("android.test.purchased", "{\"productId\":\"android.test.purchased\",\"type\":\"inapp\",\"title\":\"Tiêu đề mẫu\",\"description\":\"Mô tả mẫu về sản phẩm: android.test.purchased.\",\"skuDetailsToken\":\"AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC\",\"oneTimePurchaseOfferDetails\":{\"priceAmountMicros\":23207002450,\"priceCurrencyCode\":\"VND\",\"formattedPrice\":\"23.207 ₫\"}}', parsedJson={\"productId\":\"android.test.purchased\",\"type\":\"inapp\",\"title\":\"Tiêu đề mẫu\",\"description\":\"Mô tả mẫu về sản phẩm: android.test.purchased.\",\"skuDetailsToken\":\"AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC\",\"oneTimePurchaseOfferDetails\":{\"priceAmountMicros\":23207002450,\"priceCurrencyCode\":\"VND\",\"formattedPrice\":\"23.207 ₫\"}}, productId='android.test.purchased', productType='inapp', title='Tiêu đề mẫu', productDetailsToken='AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC', subscriptionOfferDetails=null}");
                                }
                                eVar.dismiss();
                                return;
                            case 1:
                                eVar.dismiss();
                                return;
                            default:
                                eVar.getClass();
                                c.a().f18018m = true;
                                k3.a aVar2 = eVar.f18031z;
                                if (aVar2 != null) {
                                    ((ag.b) aVar2).e(eVar.f18025s.f162c, "{\"productId\":\"android.test.purchased\",\"type\":\"inapp\",\"title\":\"Tiêu đề mẫu\",\"description\":\"Mô tả mẫu về sản phẩm: android.test.purchased.\",\"skuDetailsToken\":\"AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC\",\"oneTimePurchaseOfferDetails\":{\"priceAmountMicros\":23207002450,\"priceCurrencyCode\":\"VND\",\"formattedPrice\":\"23.207 ₫\"}}', parsedJson={\"productId\":\"android.test.purchased\",\"type\":\"inapp\",\"title\":\"Tiêu đề mẫu\",\"description\":\"Mô tả mẫu về sản phẩm: android.test.purchased.\",\"skuDetailsToken\":\"AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC\",\"oneTimePurchaseOfferDetails\":{\"priceAmountMicros\":23207002450,\"priceCurrencyCode\":\"VND\",\"formattedPrice\":\"23.207 ₫\"}}, productId='android.test.purchased', productType='inapp', title='Tiêu đề mẫu', productDetailsToken='AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC', subscriptionOfferDetails=null}");
                                }
                                eVar.dismiss();
                                return;
                        }
                    }
                });
                return;
            } else {
                this.f18030y.setOnClickListener(new View.OnClickListener(this) { // from class: g3.d

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ e f18024c;

                    {
                        this.f18024c = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i12 = i10;
                        e eVar = this.f18024c;
                        switch (i12) {
                            case 0:
                                eVar.getClass();
                                c.a().f18018m = true;
                                k3.a aVar = eVar.f18031z;
                                if (aVar != null) {
                                    ((ag.b) aVar).e("android.test.purchased", "{\"productId\":\"android.test.purchased\",\"type\":\"inapp\",\"title\":\"Tiêu đề mẫu\",\"description\":\"Mô tả mẫu về sản phẩm: android.test.purchased.\",\"skuDetailsToken\":\"AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC\",\"oneTimePurchaseOfferDetails\":{\"priceAmountMicros\":23207002450,\"priceCurrencyCode\":\"VND\",\"formattedPrice\":\"23.207 ₫\"}}', parsedJson={\"productId\":\"android.test.purchased\",\"type\":\"inapp\",\"title\":\"Tiêu đề mẫu\",\"description\":\"Mô tả mẫu về sản phẩm: android.test.purchased.\",\"skuDetailsToken\":\"AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC\",\"oneTimePurchaseOfferDetails\":{\"priceAmountMicros\":23207002450,\"priceCurrencyCode\":\"VND\",\"formattedPrice\":\"23.207 ₫\"}}, productId='android.test.purchased', productType='inapp', title='Tiêu đề mẫu', productDetailsToken='AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC', subscriptionOfferDetails=null}");
                                }
                                eVar.dismiss();
                                return;
                            case 1:
                                eVar.dismiss();
                                return;
                            default:
                                eVar.getClass();
                                c.a().f18018m = true;
                                k3.a aVar2 = eVar.f18031z;
                                if (aVar2 != null) {
                                    ((ag.b) aVar2).e(eVar.f18025s.f162c, "{\"productId\":\"android.test.purchased\",\"type\":\"inapp\",\"title\":\"Tiêu đề mẫu\",\"description\":\"Mô tả mẫu về sản phẩm: android.test.purchased.\",\"skuDetailsToken\":\"AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC\",\"oneTimePurchaseOfferDetails\":{\"priceAmountMicros\":23207002450,\"priceCurrencyCode\":\"VND\",\"formattedPrice\":\"23.207 ₫\"}}', parsedJson={\"productId\":\"android.test.purchased\",\"type\":\"inapp\",\"title\":\"Tiêu đề mẫu\",\"description\":\"Mô tả mẫu về sản phẩm: android.test.purchased.\",\"skuDetailsToken\":\"AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC\",\"oneTimePurchaseOfferDetails\":{\"priceAmountMicros\":23207002450,\"priceCurrencyCode\":\"VND\",\"formattedPrice\":\"23.207 ₫\"}}, productId='android.test.purchased', productType='inapp', title='Tiêu đề mẫu', productDetailsToken='AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC', subscriptionOfferDetails=null}");
                                }
                                eVar.dismiss();
                                return;
                        }
                    }
                });
                return;
            }
        }
        this.u.setText(uVar.f164e);
        this.f18027v.setText(uVar.f165f);
        this.f18028w.setText(uVar.f162c);
        String str = "$2.00";
        if (this.f18026t == 1) {
            q a = uVar.a();
            if (a != null) {
                str = a.a;
            }
            this.f18029x.setText(str);
        } else {
            ArrayList arrayList = uVar.f168i;
            if (arrayList != null && !arrayList.isEmpty()) {
                str = ((r) ((t) arrayList.get(0)).f160b.a.get(0)).a;
            }
            this.f18029x.setText(str);
        }
        final int i12 = 2;
        this.f18030y.setOnClickListener(new View.OnClickListener(this) { // from class: g3.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f18024c;

            {
                this.f18024c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = i12;
                e eVar = this.f18024c;
                switch (i122) {
                    case 0:
                        eVar.getClass();
                        c.a().f18018m = true;
                        k3.a aVar = eVar.f18031z;
                        if (aVar != null) {
                            ((ag.b) aVar).e("android.test.purchased", "{\"productId\":\"android.test.purchased\",\"type\":\"inapp\",\"title\":\"Tiêu đề mẫu\",\"description\":\"Mô tả mẫu về sản phẩm: android.test.purchased.\",\"skuDetailsToken\":\"AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC\",\"oneTimePurchaseOfferDetails\":{\"priceAmountMicros\":23207002450,\"priceCurrencyCode\":\"VND\",\"formattedPrice\":\"23.207 ₫\"}}', parsedJson={\"productId\":\"android.test.purchased\",\"type\":\"inapp\",\"title\":\"Tiêu đề mẫu\",\"description\":\"Mô tả mẫu về sản phẩm: android.test.purchased.\",\"skuDetailsToken\":\"AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC\",\"oneTimePurchaseOfferDetails\":{\"priceAmountMicros\":23207002450,\"priceCurrencyCode\":\"VND\",\"formattedPrice\":\"23.207 ₫\"}}, productId='android.test.purchased', productType='inapp', title='Tiêu đề mẫu', productDetailsToken='AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC', subscriptionOfferDetails=null}");
                        }
                        eVar.dismiss();
                        return;
                    case 1:
                        eVar.dismiss();
                        return;
                    default:
                        eVar.getClass();
                        c.a().f18018m = true;
                        k3.a aVar2 = eVar.f18031z;
                        if (aVar2 != null) {
                            ((ag.b) aVar2).e(eVar.f18025s.f162c, "{\"productId\":\"android.test.purchased\",\"type\":\"inapp\",\"title\":\"Tiêu đề mẫu\",\"description\":\"Mô tả mẫu về sản phẩm: android.test.purchased.\",\"skuDetailsToken\":\"AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC\",\"oneTimePurchaseOfferDetails\":{\"priceAmountMicros\":23207002450,\"priceCurrencyCode\":\"VND\",\"formattedPrice\":\"23.207 ₫\"}}', parsedJson={\"productId\":\"android.test.purchased\",\"type\":\"inapp\",\"title\":\"Tiêu đề mẫu\",\"description\":\"Mô tả mẫu về sản phẩm: android.test.purchased.\",\"skuDetailsToken\":\"AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC\",\"oneTimePurchaseOfferDetails\":{\"priceAmountMicros\":23207002450,\"priceCurrencyCode\":\"VND\",\"formattedPrice\":\"23.207 ₫\"}}, productId='android.test.purchased', productType='inapp', title='Tiêu đề mẫu', productDetailsToken='AEuhp4Izz50wTvd7YM9wWjPLp8hZY7jRPhBEcM9GAbTYSdUM_v2QX85e8UYklstgqaRC', subscriptionOfferDetails=null}");
                        }
                        eVar.dismiss();
                        return;
                }
            }
        });
    }

    @Override // v9.g, androidx.activity.o, android.app.Dialog
    public final void onStart() {
        super.onStart();
        getWindow().setLayout(-1, -2);
    }
}
