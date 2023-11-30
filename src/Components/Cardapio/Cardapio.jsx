import { useState, useEffect } from 'react';
import axios from 'axios';
import "./Cardapio.css"

const Cardapio = () => {
  const [data, setData] = useState([]);

  useEffect(() => {
    axios.get("http://localhost:8080/cardapio")
      .then(response => setData(response.data));
  }, []);

  return (
    <section id='cardapio'>
        <h2>Cardápio</h2>
        <h2>Restaurante A Casa da Comida</h2>
        <div className='container-cardapio'>
        {data.map(item => (
            <div className='cardapio' key={item.id}>
            <p><strong>Prato:</strong> {item.nomeComida}</p>
            <p><strong>Preço:</strong> {item.precoComida}</p>
            <img src={item.fotoComida} alt={item.nomeComida} />
            {/* Adicione mais campos conforme necessário */}
            </div>
        ))}
        </div>
    </section>
  );
};

export default Cardapio;
