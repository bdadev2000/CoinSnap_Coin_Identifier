package J1;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1554a;
    public static final g b;

    /* renamed from: c, reason: collision with root package name */
    public static final g f1555c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f1556d;

    /* renamed from: e, reason: collision with root package name */
    public static final g f1557e;

    /* renamed from: f, reason: collision with root package name */
    public static final g f1558f;

    /* renamed from: g, reason: collision with root package name */
    public static final g f1559g;

    /* renamed from: h, reason: collision with root package name */
    public static final g f1560h;

    /* renamed from: i, reason: collision with root package name */
    public static final g f1561i;

    /* renamed from: j, reason: collision with root package name */
    public static final g f1562j;

    /* renamed from: k, reason: collision with root package name */
    public static final g f1563k;
    public static final g l;
    public static final g m;

    /* renamed from: n, reason: collision with root package name */
    public static final g f1564n;

    /* renamed from: o, reason: collision with root package name */
    public static final g f1565o;

    /* renamed from: p, reason: collision with root package name */
    public static final g f1566p;

    /* renamed from: q, reason: collision with root package name */
    public static final g f1567q;

    static {
        f a6 = g.a();
        a6.f1519a = 3;
        a6.b = "Google Play In-app Billing API version is less than 3";
        f1554a = a6.a();
        f a9 = g.a();
        a9.f1519a = 3;
        a9.b = "Google Play In-app Billing API version is less than 9";
        b = a9.a();
        f a10 = g.a();
        a10.f1519a = 3;
        a10.b = "Billing service unavailable on device.";
        f1555c = a10.a();
        f a11 = g.a();
        a11.f1519a = 5;
        a11.b = "Client is already in the process of connecting to billing service.";
        f1556d = a11.a();
        f a12 = g.a();
        a12.f1519a = 5;
        a12.b = "The list of SKUs can't be empty.";
        a12.a();
        f a13 = g.a();
        a13.f1519a = 5;
        a13.b = "SKU type can't be empty.";
        a13.a();
        f a14 = g.a();
        a14.f1519a = 5;
        a14.b = "Product type can't be empty.";
        f1557e = a14.a();
        f a15 = g.a();
        a15.f1519a = -2;
        a15.b = "Client does not support extra params.";
        f1558f = a15.a();
        f a16 = g.a();
        a16.f1519a = 5;
        a16.b = "Invalid purchase token.";
        f1559g = a16.a();
        f a17 = g.a();
        a17.f1519a = 6;
        a17.b = "An internal error occurred.";
        f1560h = a17.a();
        f a18 = g.a();
        a18.f1519a = 5;
        a18.b = "SKU can't be null.";
        a18.a();
        f a19 = g.a();
        a19.f1519a = 0;
        f1561i = a19.a();
        f a20 = g.a();
        a20.f1519a = -1;
        a20.b = "Service connection is disconnected.";
        f1562j = a20.a();
        f a21 = g.a();
        a21.f1519a = 2;
        a21.b = "Timeout communicating with service.";
        f1563k = a21.a();
        f a22 = g.a();
        a22.f1519a = -2;
        a22.b = "Client does not support subscriptions.";
        l = a22.a();
        f a23 = g.a();
        a23.f1519a = -2;
        a23.b = "Client does not support subscriptions update.";
        a23.a();
        f a24 = g.a();
        a24.f1519a = -2;
        a24.b = "Client does not support get purchase history.";
        a24.a();
        f a25 = g.a();
        a25.f1519a = -2;
        a25.b = "Client does not support price change confirmation.";
        a25.a();
        f a26 = g.a();
        a26.f1519a = -2;
        a26.b = "Play Store version installed does not support cross selling products.";
        a26.a();
        f a27 = g.a();
        a27.f1519a = -2;
        a27.b = "Client does not support multi-item purchases.";
        m = a27.a();
        f a28 = g.a();
        a28.f1519a = -2;
        a28.b = "Client does not support offer_id_token.";
        f1564n = a28.a();
        f a29 = g.a();
        a29.f1519a = -2;
        a29.b = "Client does not support ProductDetails.";
        f1565o = a29.a();
        f a30 = g.a();
        a30.f1519a = -2;
        a30.b = "Client does not support in-app messages.";
        a30.a();
        f a31 = g.a();
        a31.f1519a = -2;
        a31.b = "Client does not support user choice billing.";
        a31.a();
        f a32 = g.a();
        a32.f1519a = -2;
        a32.b = "Play Store version installed does not support external offer.";
        a32.a();
        f a33 = g.a();
        a33.f1519a = 5;
        a33.b = "Unknown feature";
        a33.a();
        f a34 = g.a();
        a34.f1519a = -2;
        a34.b = "Play Store version installed does not support get billing config.";
        a34.a();
        f a35 = g.a();
        a35.f1519a = -2;
        a35.b = "Query product details with serialized docid is not supported.";
        a35.a();
        f a36 = g.a();
        a36.f1519a = 4;
        a36.b = "Item is unavailable for purchase.";
        f1566p = a36.a();
        f a37 = g.a();
        a37.f1519a = -2;
        a37.b = "Query product details with developer specified account is not supported.";
        a37.a();
        f a38 = g.a();
        a38.f1519a = -2;
        a38.b = "Play Store version installed does not support alternative billing only.";
        a38.a();
        f a39 = g.a();
        a39.f1519a = 5;
        a39.b = "To use this API you must specify a PurchasesUpdateListener when initializing a BillingClient.";
        f1567q = a39.a();
    }

    public static g a(int i9, String str) {
        f a6 = g.a();
        a6.f1519a = i9;
        a6.b = str;
        return a6.a();
    }
}
