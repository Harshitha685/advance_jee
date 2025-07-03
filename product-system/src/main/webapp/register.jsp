<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Add Product - MyShop</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>

  <main>
    <div class="form-container">
      <h2>Add a New Product</h2>
      <form action="saveProduct" method="POST" enctype="multipart/form-data">


        <label for="productName">Product Name:</label>
        <input type="text" id="productName" name="productName" required placeholder="e.g. Samsung Galaxy M14">


        <label for="category">Category:</label>
        <input type="text" id="category" name="category" required placeholder="e.g. Mobile Phones">


        <label for="price">Price (₹):</label>
        <input type="number" id="price" name="price" step="0.01" required placeholder="e.g. 12999">


        <label for="quantity">Quantity:</label>
        <input type="number" id="quantity" name="quantity" required placeholder="e.g. 100">


        <label for="description">Description:</label>
        <textarea id="description" name="description" rows="4" required placeholder="Enter product details here..."></textarea>

        <!-- Submit Button -->
        <button type="submit">Save Product</button>
      </form>
    </div>
  </main>

</body>
</html>
