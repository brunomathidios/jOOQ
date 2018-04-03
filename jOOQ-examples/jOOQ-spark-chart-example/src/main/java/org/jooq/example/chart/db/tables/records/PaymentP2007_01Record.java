/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.chart.db.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.example.chart.db.tables.PaymentP2007_01;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.0",
        "schema version:public_2"
    },
    date = "2018-04-03T12:47:15.287Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaymentP2007_01Record extends TableRecordImpl<PaymentP2007_01Record> implements Record6<Integer, Integer, Integer, Integer, BigDecimal, Timestamp> {

    private static final long serialVersionUID = 724614582;

    /**
     * Setter for <code>public.payment_p2007_01.payment_id</code>.
     */
    public void setPaymentId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.payment_p2007_01.payment_id</code>.
     */
    public Integer getPaymentId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.payment_p2007_01.customer_id</code>.
     */
    public void setCustomerId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.payment_p2007_01.customer_id</code>.
     */
    public Integer getCustomerId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.payment_p2007_01.staff_id</code>.
     */
    public void setStaffId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.payment_p2007_01.staff_id</code>.
     */
    public Integer getStaffId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.payment_p2007_01.rental_id</code>.
     */
    public void setRentalId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.payment_p2007_01.rental_id</code>.
     */
    public Integer getRentalId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.payment_p2007_01.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.payment_p2007_01.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>public.payment_p2007_01.payment_date</code>.
     */
    public void setPaymentDate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.payment_p2007_01.payment_date</code>.
     */
    public Timestamp getPaymentDate() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, BigDecimal, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, Integer, Integer, BigDecimal, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PaymentP2007_01.PAYMENT_P2007_01.PAYMENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return PaymentP2007_01.PAYMENT_P2007_01.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return PaymentP2007_01.PAYMENT_P2007_01.STAFF_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return PaymentP2007_01.PAYMENT_P2007_01.RENTAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return PaymentP2007_01.PAYMENT_P2007_01.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return PaymentP2007_01.PAYMENT_P2007_01.PAYMENT_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPaymentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getStaffId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getRentalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getPaymentDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPaymentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getStaffId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getRentalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getPaymentDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentP2007_01Record value1(Integer value) {
        setPaymentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentP2007_01Record value2(Integer value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentP2007_01Record value3(Integer value) {
        setStaffId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentP2007_01Record value4(Integer value) {
        setRentalId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentP2007_01Record value5(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentP2007_01Record value6(Timestamp value) {
        setPaymentDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PaymentP2007_01Record values(Integer value1, Integer value2, Integer value3, Integer value4, BigDecimal value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentP2007_01Record
     */
    public PaymentP2007_01Record() {
        super(PaymentP2007_01.PAYMENT_P2007_01);
    }

    /**
     * Create a detached, initialised PaymentP2007_01Record
     */
    public PaymentP2007_01Record(Integer paymentId, Integer customerId, Integer staffId, Integer rentalId, BigDecimal amount, Timestamp paymentDate) {
        super(PaymentP2007_01.PAYMENT_P2007_01);

        set(0, paymentId);
        set(1, customerId);
        set(2, staffId);
        set(3, rentalId);
        set(4, amount);
        set(5, paymentDate);
    }
}
