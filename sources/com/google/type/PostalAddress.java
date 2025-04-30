package com.google.type;

import com.google.protobuf.AbstractC1880c;
import com.google.protobuf.C1912g3;
import com.google.protobuf.D2;
import com.google.protobuf.E2;
import com.google.protobuf.H;
import com.google.protobuf.InterfaceC1891d3;
import com.google.protobuf.InterfaceC1948l4;
import com.google.protobuf.K2;
import com.google.protobuf.L2;
import com.google.protobuf.O3;
import com.google.protobuf.S;
import com.google.protobuf.W1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import y5.p;
import y5.q;

/* loaded from: classes3.dex */
public final class PostalAddress extends L2 implements O3 {
    public static final int ADDRESS_LINES_FIELD_NUMBER = 9;
    public static final int ADMINISTRATIVE_AREA_FIELD_NUMBER = 6;
    private static final PostalAddress DEFAULT_INSTANCE;
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    public static final int LOCALITY_FIELD_NUMBER = 7;
    public static final int ORGANIZATION_FIELD_NUMBER = 11;
    private static volatile InterfaceC1948l4 PARSER = null;
    public static final int POSTAL_CODE_FIELD_NUMBER = 4;
    public static final int RECIPIENTS_FIELD_NUMBER = 10;
    public static final int REGION_CODE_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 1;
    public static final int SORTING_CODE_FIELD_NUMBER = 5;
    public static final int SUBLOCALITY_FIELD_NUMBER = 8;
    private int revision_;
    private String regionCode_ = "";
    private String languageCode_ = "";
    private String postalCode_ = "";
    private String sortingCode_ = "";
    private String administrativeArea_ = "";
    private String locality_ = "";
    private String sublocality_ = "";
    private InterfaceC1891d3 addressLines_ = L2.emptyProtobufList();
    private InterfaceC1891d3 recipients_ = L2.emptyProtobufList();
    private String organization_ = "";

    static {
        PostalAddress postalAddress = new PostalAddress();
        DEFAULT_INSTANCE = postalAddress;
        L2.registerDefaultInstance(PostalAddress.class, postalAddress);
    }

    private PostalAddress() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAddressLines(String str) {
        str.getClass();
        ensureAddressLinesIsMutable();
        this.addressLines_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAddressLinesBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        ensureAddressLinesIsMutable();
        this.addressLines_.add(h6.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAddressLines(Iterable<String> iterable) {
        ensureAddressLinesIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.addressLines_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRecipients(Iterable<String> iterable) {
        ensureRecipientsIsMutable();
        AbstractC1880c.addAll((Iterable) iterable, (List) this.recipients_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRecipients(String str) {
        str.getClass();
        ensureRecipientsIsMutable();
        this.recipients_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRecipientsBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        ensureRecipientsIsMutable();
        this.recipients_.add(h6.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddressLines() {
        this.addressLines_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdministrativeArea() {
        this.administrativeArea_ = getDefaultInstance().getAdministrativeArea();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguageCode() {
        this.languageCode_ = getDefaultInstance().getLanguageCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocality() {
        this.locality_ = getDefaultInstance().getLocality();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOrganization() {
        this.organization_ = getDefaultInstance().getOrganization();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPostalCode() {
        this.postalCode_ = getDefaultInstance().getPostalCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRecipients() {
        this.recipients_ = L2.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegionCode() {
        this.regionCode_ = getDefaultInstance().getRegionCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRevision() {
        this.revision_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSortingCode() {
        this.sortingCode_ = getDefaultInstance().getSortingCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSublocality() {
        this.sublocality_ = getDefaultInstance().getSublocality();
    }

    private void ensureAddressLinesIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.addressLines_;
        if (!interfaceC1891d3.isModifiable()) {
            this.addressLines_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    private void ensureRecipientsIsMutable() {
        InterfaceC1891d3 interfaceC1891d3 = this.recipients_;
        if (!interfaceC1891d3.isModifiable()) {
            this.recipients_ = L2.mutableCopy(interfaceC1891d3);
        }
    }

    public static PostalAddress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static q newBuilder() {
        return (q) DEFAULT_INSTANCE.createBuilder();
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PostalAddress) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer) throws C1912g3 {
        return (PostalAddress) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC1948l4 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddressLines(int i9, String str) {
        str.getClass();
        ensureAddressLinesIsMutable();
        this.addressLines_.set(i9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdministrativeArea(String str) {
        str.getClass();
        this.administrativeArea_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdministrativeAreaBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.administrativeArea_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCode(String str) {
        str.getClass();
        this.languageCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageCodeBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.languageCode_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocality(String str) {
        str.getClass();
        this.locality_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocalityBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.locality_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrganization(String str) {
        str.getClass();
        this.organization_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOrganizationBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.organization_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostalCode(String str) {
        str.getClass();
        this.postalCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostalCodeBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.postalCode_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecipients(int i9, String str) {
        str.getClass();
        ensureRecipientsIsMutable();
        this.recipients_.set(i9, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionCode(String str) {
        str.getClass();
        this.regionCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegionCodeBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.regionCode_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRevision(int i9) {
        this.revision_ = i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSortingCode(String str) {
        str.getClass();
        this.sortingCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSortingCodeBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.sortingCode_ = h6.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSublocality(String str) {
        str.getClass();
        this.sublocality_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSublocalityBytes(H h6) {
        AbstractC1880c.checkByteStringIsUtf8(h6);
        this.sublocality_ = h6.toStringUtf8();
    }

    @Override // com.google.protobuf.L2
    public final Object dynamicMethod(K2 k22, Object obj, Object obj2) {
        switch (p.f24442a[k22.ordinal()]) {
            case 1:
                return new PostalAddress();
            case 2:
                return new D2(DEFAULT_INSTANCE);
            case 3:
                return L2.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȚ\nȚ\u000bȈ", new Object[]{"revision_", "regionCode_", "languageCode_", "postalCode_", "sortingCode_", "administrativeArea_", "locality_", "sublocality_", "addressLines_", "recipients_", "organization_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC1948l4 interfaceC1948l4 = PARSER;
                if (interfaceC1948l4 == null) {
                    synchronized (PostalAddress.class) {
                        try {
                            interfaceC1948l4 = PARSER;
                            if (interfaceC1948l4 == null) {
                                interfaceC1948l4 = new E2(DEFAULT_INSTANCE);
                                PARSER = interfaceC1948l4;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC1948l4;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getAddressLines(int i9) {
        return (String) this.addressLines_.get(i9);
    }

    public H getAddressLinesBytes(int i9) {
        return H.copyFromUtf8((String) this.addressLines_.get(i9));
    }

    public int getAddressLinesCount() {
        return this.addressLines_.size();
    }

    public List<String> getAddressLinesList() {
        return this.addressLines_;
    }

    public String getAdministrativeArea() {
        return this.administrativeArea_;
    }

    public H getAdministrativeAreaBytes() {
        return H.copyFromUtf8(this.administrativeArea_);
    }

    public String getLanguageCode() {
        return this.languageCode_;
    }

    public H getLanguageCodeBytes() {
        return H.copyFromUtf8(this.languageCode_);
    }

    public String getLocality() {
        return this.locality_;
    }

    public H getLocalityBytes() {
        return H.copyFromUtf8(this.locality_);
    }

    public String getOrganization() {
        return this.organization_;
    }

    public H getOrganizationBytes() {
        return H.copyFromUtf8(this.organization_);
    }

    public String getPostalCode() {
        return this.postalCode_;
    }

    public H getPostalCodeBytes() {
        return H.copyFromUtf8(this.postalCode_);
    }

    public String getRecipients(int i9) {
        return (String) this.recipients_.get(i9);
    }

    public H getRecipientsBytes(int i9) {
        return H.copyFromUtf8((String) this.recipients_.get(i9));
    }

    public int getRecipientsCount() {
        return this.recipients_.size();
    }

    public List<String> getRecipientsList() {
        return this.recipients_;
    }

    public String getRegionCode() {
        return this.regionCode_;
    }

    public H getRegionCodeBytes() {
        return H.copyFromUtf8(this.regionCode_);
    }

    public int getRevision() {
        return this.revision_;
    }

    public String getSortingCode() {
        return this.sortingCode_;
    }

    public H getSortingCodeBytes() {
        return H.copyFromUtf8(this.sortingCode_);
    }

    public String getSublocality() {
        return this.sublocality_;
    }

    public H getSublocalityBytes() {
        return H.copyFromUtf8(this.sublocality_);
    }

    public static q newBuilder(PostalAddress postalAddress) {
        return (q) DEFAULT_INSTANCE.createBuilder(postalAddress);
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream, W1 w1) throws IOException {
        return (PostalAddress) L2.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static PostalAddress parseFrom(ByteBuffer byteBuffer, W1 w1) throws C1912g3 {
        return (PostalAddress) L2.parseFrom(DEFAULT_INSTANCE, byteBuffer, w1);
    }

    public static PostalAddress parseFrom(H h6) throws C1912g3 {
        return (PostalAddress) L2.parseFrom(DEFAULT_INSTANCE, h6);
    }

    public static PostalAddress parseFrom(H h6, W1 w1) throws C1912g3 {
        return (PostalAddress) L2.parseFrom(DEFAULT_INSTANCE, h6, w1);
    }

    public static PostalAddress parseFrom(byte[] bArr) throws C1912g3 {
        return (PostalAddress) L2.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PostalAddress parseFrom(byte[] bArr, W1 w1) throws C1912g3 {
        return (PostalAddress) L2.parseFrom(DEFAULT_INSTANCE, bArr, w1);
    }

    public static PostalAddress parseFrom(InputStream inputStream) throws IOException {
        return (PostalAddress) L2.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PostalAddress parseFrom(InputStream inputStream, W1 w1) throws IOException {
        return (PostalAddress) L2.parseFrom(DEFAULT_INSTANCE, inputStream, w1);
    }

    public static PostalAddress parseFrom(S s5) throws IOException {
        return (PostalAddress) L2.parseFrom(DEFAULT_INSTANCE, s5);
    }

    public static PostalAddress parseFrom(S s5, W1 w1) throws IOException {
        return (PostalAddress) L2.parseFrom(DEFAULT_INSTANCE, s5, w1);
    }
}
