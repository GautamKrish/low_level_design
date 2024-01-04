/*
1.createOrder
2.payForOrder
3.showOrderSummary
4.updateWalletBalance
*/

//Pyramid of Doom
//Inversion of Control
const cart = ["Shoes", "Kurta", "T-Shirt", "Jeans"];

api.createOrder(cart, function (orderId) {
    console.log("Order ID: " + orderId);
    api.payForOrder(orderId, function (paymentId) {
        console.log("Payment details: " + paymentId);
        api.showOrderSummary(paymentId, function (orderAmount) {
            console.log("Order amount: " + orderAmount);
            api.updateWalletBalance(orderAmount, function (orderAmount) {
                console.log("Updated Wallet Balance: " + walletAmt - orderAmount);
            })
        });
    });
});

//------------------------------------------------------------------------------------
//Promise chaining
//Promise solves Inversion of Control
const orderId = api.createOrder(cart);

orderId.then(function (orderId) {
    return api.payForOrder(orderId);
}).then(function (paymentId) {
    return api.showOrderSummary(orderAmount);
}).then(function (orderAmount) {
    return api.updateWalletBalance(orderAmount);
}).then(function () {
    console.log("Updated wallet balance: " + walletAmt - orderAmount);
})

//-------------------------------------------------------------------------------------
//Arrow functions make it neat

const orderId = api.createOrder(cart);

orderId
    .then((orderId) => api.payForOrder(orderId))
    .then((paymentId) => api.showOrderSummary(paymentId))
    .then((orderAmount) => api.showOrderSummary(orderAmount))
    .then((orderAmount) => api.updateWalletBalance(orderAmount))
    .then(() => console.log("Updated wallet balance: " + walletAmt - orderAmount));